package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button BtnSingIn,BtnSingUp;
    private EditText txtUserr,txtPasss;
    private String userv = "Juan", passv="123";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BtnSingIn = findViewById(R.id.BtnEntrar);
        BtnSingUp = findViewById(R.id.BtnRegistro);
        BtnSingIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //OpenMenu();
            }
        });
        BtnSingUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // OpenRegistro();
            }
        });
    }
    public void OpenMenu(View view){
        txtUserr = (EditText) findViewById(R.id.txtUser);
        txtPasss = (EditText) findViewById(R.id.txtPass);
        String user = txtUserr.getText().toString(), pass = txtPasss.getText().toString();

        if(userv.equals(user) && passv.equals(pass)){
            Intent intent = new Intent(this, menu.class);
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "Bienvenido", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getApplicationContext(), "Usuario Incorrecto", Toast.LENGTH_SHORT).show();
        }
    }
    public void OpenRegistro(View view){

    }

    public void holo (View view) {

    }
}
