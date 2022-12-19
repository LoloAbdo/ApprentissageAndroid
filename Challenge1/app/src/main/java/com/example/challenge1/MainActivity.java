package com.example.challenge1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickRegister(View view) {
        // Find views ID
        TextView txtFirstName = findViewById(R.id.txtFirstName);
        TextView txtLastName = findViewById(R.id.txtLastName);
        TextView txtEmail = findViewById(R.id.txtEmail);

        EditText edtTxtFirst = findViewById(R.id.edtTxtFirstName);
        EditText edtTxtLast = findViewById(R.id.edtTxtLastName);
        EditText edtTxtEmail = findViewById(R.id.edtTxtEmail);

        txtFirstName.setText("First Name: " + edtTxtFirst.getText().toString());
        txtLastName.setText("Last Name: " + edtTxtLast.getText().toString());
        txtEmail.setText("Email: " + edtTxtEmail.getText().toString());
    }
}