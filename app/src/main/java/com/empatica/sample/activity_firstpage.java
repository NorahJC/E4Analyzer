package com.empatica.sample;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class activity_firstpage extends AppCompatActivity {

    private EditText userField;
    private EditText passField;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);
        //white background
        getWindow().getDecorView().setBackgroundColor(Color.WHITE);

        //relating id of design/xml to variable names
        userField = (EditText)findViewById(R.id.username);
        passField = (EditText)findViewById(R.id.pass);
        loginButton = (Button)findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(userField.getText().toString(), passField.getText().toString());

            }
        });
    }
    //login logic
    private void validate (String userf, String passf){
        if((userf.equals("pspoleti@kennesaw.edu")) && (passf.equals("NorahLSAMP18")) ||
                (userf.equals("test123")) && (passf.equals("123")))
        {
            Intent switchToHome = new Intent(activity_firstpage.this, activity_secondpage.class);
            startActivity(switchToHome);
        }
        else
        {
            Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show();
        }
    }
}

