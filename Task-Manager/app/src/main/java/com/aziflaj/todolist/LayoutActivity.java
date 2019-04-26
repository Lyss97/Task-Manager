package com.aziflaj.todolist;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class LayoutActivity extends AppCompatActivity {

    private String devID;
    private String LayoutID;
    private String blockVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_am);

        Bundle bundle = getIntent().getExtras();
        LayoutID = bundle.getString("LayoutID");
        devID = bundle.getString("devID");

        Log.d("check", LayoutID);
    }

    public void launchPmView(View view1) {
        setContentView(R.layout.layout_pm);
    }

    public void launchAmView(View view2) {
        setContentView(R.layout.layout_am);
    }

    public void onClick(View view3) {
        Button b = (Button) view3;
        String blockVal = b.getText().toString();
        launchTaskActivity(view3);
    }




    public void launchTaskActivity(View view) {
        Intent taskIntent = new Intent(this, ToDoActivity.class);

        //Create the bundle
        Bundle bundle = new Bundle();

        //Add data to bundle
        bundle.putString("layoutID", LayoutID);
        bundle.putString("blockVal", blockVal);
        //Add the bundle to the intent
        taskIntent.putExtras(bundle);

        //Fire menu activity
        startActivity(taskIntent);


    }


}


