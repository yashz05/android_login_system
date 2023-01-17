package com.twp.authentication;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class home_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();



        setContentView(R.layout.activity_home_page);
        TextView welcome = findViewById(R.id.welcome);

        if (getIntent() != null) {
            String value = extras.getString("user_name");
//            welcome.setText(value.toString());
            Log.d(TAG, "Value received: "+value);
            welcome.setText("Welcome back "+value);
        }
    }
}