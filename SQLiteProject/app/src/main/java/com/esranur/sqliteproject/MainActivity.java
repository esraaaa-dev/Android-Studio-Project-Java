package com.esranur.sqliteproject;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        try {

            SQLiteDatabase database = this.openOrCreateDatabase("Musicians",MODE_PRIVATE,null);//Veri tabanı yoksa oluşturduk,varsa da açtık.
            database.execSQL("CREATE TABLE IF NOT EXISTS musicians (name VARCHAR,age INTEGER)");
            database.execSQL("INSERT INTO musicians(name,age) VALUES ('Esra',20)"); // veri ekleme işlemi

            Cursor cursor= database.rawQuery("SELECT *FROM musicians",null); // cursor= imleç,veri tabanındaki bilgileri tek tek okumayı sağlar
            int nameIx= cursor.getColumnIndex("name");
            int ageIx = cursor.getColumnIndex("age");
            while (cursor.moveToNext()){
                System.out.println("Name: "+ cursor.getString(nameIx));
                System.out.println("Age: "+ cursor.getInt(ageIx));
            }cursor.close();


        }catch (Exception e){
            e.printStackTrace();
        }


    }
}