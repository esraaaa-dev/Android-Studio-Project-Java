package com.esranur.multipleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String username;
    EditText PersonName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PersonName= findViewById(R.id.PersonName);
    }
    public void changeActivity(View view){
        username=PersonName.getText().toString();
        Intent intent =new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtra("userInput",username);
        startActivity(intent);



    }
}