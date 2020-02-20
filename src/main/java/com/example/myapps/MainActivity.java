package com.example.myapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLogin = findViewById(R.id.btn_login);
        final EditText etEmail = findViewById(R.id.et_email);
        final EditText etPass = findViewById(R.id.et_password);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etEmail.getText().toString().equals("") &&
                        etPass.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(),
                            "Email dan Password tidak boleh kosong",
                            Toast.LENGTH_SHORT).show();
                } else if (etEmail.getText().toString().equals("") ||
                        etPass.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(),
                            "Email dan Password tidak boleh kosong",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

    }
}
