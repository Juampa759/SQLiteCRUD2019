package com.example.menu;

import android.widget.EditText;

public class DataAccessUsers  {
    private String Name,Lastname,Email,Password;
    private int Id;

    public DataAccessUsers() {
    }

    public DataAccessUsers(String name, String lastname, String email, String password, int id) {
        Name = name;
        Lastname = lastname;
        Email = email;
        Password = password;
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
