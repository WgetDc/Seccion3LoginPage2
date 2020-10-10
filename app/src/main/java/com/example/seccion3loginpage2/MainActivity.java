package com.example.seccion3loginpage2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtMain_email, edtMain_password;
    //EditText edtMain_password;
    String correo = "carlos@mail.cl";
    String clave = "carlos123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtMain_email = (EditText)findViewById(R.id.edtMain_email);
        edtMain_password = (EditText)findViewById(R.id.edtMain_password);

        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
    }

    public void goToHomePage(View view){
        if (correo.equals(edtMain_email.getText().toString()) && clave.equals(edtMain_password.getText().toString())){
            Intent activity = new Intent(this, HomeActivity.class);
            startActivity(activity);
        }else {
            Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
        }
    }
}