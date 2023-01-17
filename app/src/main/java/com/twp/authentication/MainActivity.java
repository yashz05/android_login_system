package com.twp.authentication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String username = "yash";
        String password = "123";
        String email = "yashc1999@gmail.com";

        Button login = findViewById(R.id.login_btn);
        EditText user_name_text = findViewById(R.id.username);
        EditText password_text = findViewById(R.id.password);
        EditText email_text = findViewById(R.id.email);


        login.setOnClickListener(e -> {
            if (username.equals(user_name_text.getText().toString()) ) {
                if (email.equals(email_text.getText().toString())) {
                    //email right
                    if (password.equals(password_text.getText().toString())) {
                        //Password right
                        //if all right go to new Activity

                        Intent i = new Intent(getApplicationContext(), home_page.class);
                        i.putExtra("user_name", user_name_text.getText().toString());
                        startActivity(i);
                    } else {
                        //pasword  wrong
                        error("Password Wrong");
                    }
                } else {
                    //email wrong
                    error("Email Id Wrong");
                }

            } else {
                //username wrong
                error("Username Wrong");
            }
        });

    }

    public void error(String e) {
        Toast.makeText(MainActivity.this, e, Toast.LENGTH_SHORT).show();
    }
}