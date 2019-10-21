package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void entrar(View view){
        Intent intent = new Intent(this, ListUsers.class);
        startActivity(intent);
        Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT).show();
    }
    public void Regisro(View view){
        Intent intent = new Intent(this, Signin.class);
        startActivity(intent);
        Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT).show();
    }

}
