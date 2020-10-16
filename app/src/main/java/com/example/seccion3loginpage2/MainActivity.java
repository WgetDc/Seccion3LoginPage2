package com.example.seccion3loginpage2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String correo = "ingcorellana@gmail.com";
    String clave = "carlos123";

    EditText edtMain_email;
    EditText edtMain_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Oculta el action bar
        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }

        edtMain_email = (EditText) findViewById(R.id.edtMain_email);
        edtMain_password = findViewById(R.id.edtMain_password);

    }

    public void goToHomeActivity(View view){
        String getEmail = edtMain_email.getText().toString();
        String getPassword = edtMain_password.getText().toString();
        if(correo.equals(getEmail) && clave.equals(getPassword)){
            Intent activity = new Intent(this, HomeActivity.class);
            startActivity(activity);
            Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
        }
    /*
        String getEmail = edtMain_email.getText().toString();
        String getPassword = edtMain_password.getText().toString();

        Toast.makeText(this, "Su correo es: " + getEmail, Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "Su contraseña es: " + getPassword, Toast.LENGTH_SHORT).show();

    */
    }


}