package com.aziflaj.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        TextView txtview=(TextView)findViewById(R.id.textview);
        String text="Layout 1 \n Layout 2 \n Layout 3 \n Layout 4 \n Layout 5 \n Layout 6 \n Layout 7 Layout 8 \n Layout 9 \n Layout 10 \n Layout 11 \n Layout 12 \n Layout 13 \n Layout 14";
        txtview.setText(text);
        txtview.setMovementMethod(new ScrollingMovementMethod());
    }


    public void launchLayoutActivity(View view) {
        Intent LayoutIntent = new Intent(this, LayoutActivity.class);
        startActivity(LayoutIntent);
    }
}
