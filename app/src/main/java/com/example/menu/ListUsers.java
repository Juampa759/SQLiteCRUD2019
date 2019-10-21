package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.menu.classes.Connec;

import java.util.ArrayList;
import java.util.List;

public class ListUsers extends AppCompatActivity {
    private AdapterRecicleViewListUSer adapt;
    private RecyclerView reci;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_users);

        inflaterRecyclerView ();
    }
    public void inflaterRecyclerView (){
        reci= (RecyclerView)findViewById(R.id.RecicleViewListUser);
        reci.setLayoutManager(new LinearLayoutManager(this));


        Connec db = new Connec(getApplicationContext());
        List<DataAccessUsers> filter = new ArrayList<>();

         List<DataAccessUsers> lista=db.ListUser();


        adapt = new AdapterRecicleViewListUSer(lista);
        reci.setAdapter(adapt);

    }

    public List<DataAccessUsers> obtenerUsuarios(){
        List<DataAccessUsers> user = new ArrayList<>();
        user.add(new DataAccessUsers("Daniel","Madroñero","daanii2013@gmail.com","123",1));
        user.add(new DataAccessUsers("Esteban","Muñoz","danniesteban1200@hotmail.com","123",1));
        return user;
    }
}
