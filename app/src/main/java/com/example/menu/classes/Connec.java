package com.example.menu.classes;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.menu.DataAccessUsers;

import java.util.ArrayList;
import java.util.List;

public class Connec extends SQLiteOpenHelper  {
    public Connec(@Nullable Context context) {
        super(context, "market", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase market) {
        market.execSQL("Create Table user ("+"Id integer primary key autoincrement  not null,"+
                "firstname text not null,"+
                "lastname text not null,"+
                "email text not null,"+
                "password text not null)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public List<DataAccessUsers> ListUser (){
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery( "Select * from user", null);
        List<DataAccessUsers> list = new ArrayList<>();
        if(cursor.moveToFirst()){
            do{
                list.add(new DataAccessUsers(cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4),cursor.getInt(0)));

            }while(cursor.moveToNext());
        }
        return list;
    }
}
