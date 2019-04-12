package com.aziflaj.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class LayoutActivity extends AppCompatActivity {

//    private static final String LOG_TAG = LayoutActivity.class.getSimpleName();
//            Log.d(LOG_TAG, "Button 1 Clicked."); <<This will let you see what class calls a button, etc, onClick events
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_am);
    }

    public void launchSecondActivity(View view) {
        setContentView(R.layout.layout_pm);
    }

    public void launchFirstActivity(View view) {
        setContentView(R.layout.layout_am);
    }

    public void launchMainActivity(View view) {
        Intent TaskIntent = new Intent(this, TaskActivity.class);
        startActivity(TaskIntent);
    }
}
