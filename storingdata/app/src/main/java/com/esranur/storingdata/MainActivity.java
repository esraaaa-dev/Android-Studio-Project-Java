 package com.esranur.storingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {
    EditText editTextNumber;
    TextView textView;
    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber=findViewById(R.id.editTextNumber);
        textView=findViewById(R.id.textView);
        sharedPreferences= this.getSharedPreferences("com.esranur.storingdata",Context.MODE_PRIVATE);
        int storedAge = sharedPreferences.getInt("storedAge",0);
        textView.setText("your age:"+storedAge);



    }
    public void save(View view){
        int userAge= Integer.parseInt(editTextNumber.getText().toString());
        textView.setText("Yaşınız: "+userAge);
        sharedPreferences.edit().putInt("storedAge",userAge).apply();

    }
    public void delete(View view){
        int storedData= sharedPreferences.getInt("storedAge",0);
        if(storedData!=0){
            sharedPreferences.edit().remove("storedAge").apply();
            textView.setText("your age: ");
        }

    }
}