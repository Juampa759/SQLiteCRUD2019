package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.menu.classes.Connec;

public class Signin extends AppCompatActivity {
    private EditText name, lastname, email,password,confpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        name = findViewById(R.id.txtName);
        lastname = findViewById(R.id.txtLastName);
        email = findViewById(R.id.txtEmail);
        password = findViewById(R.id.txtPassword);
        confpass = findViewById(R.id.txtConfirmP);
    }

    public void newRegister(View view){

       Connec con = new Connec( this);

        SQLiteDatabase db = con.getWritableDatabase();

        ContentValues val= new ContentValues();

        if(!email.getText().toString().isEmpty() || !name.getText().toString().isEmpty() || !lastname.getText().toString().isEmpty() || !password.getText().toString().isEmpty() || !confpass.getText().toString().isEmpty()) {

            if(password.getText().toString().equals(confpass.getText().toString())){
                val.put("firstname",name.getText().toString());
                val.put("lastname",lastname.getText().toString());
                val.put("email",email.getText().toString());
                val.put("password",password.getText().toString());

                Long ez = db.insert("user",null,val);
                db.close();
                Toast.makeText(this, "Registro No "+ ez, Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Las contraseñas no coninciden", Toast.LENGTH_SHORT).show();
            }

            

        }else{
            Toast.makeText(this, "Error Hay campos vacíos", Toast.LENGTH_SHORT).show();
        }

    }
}
