 package com.esranur.methods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("on created called");
        testMethod();
        System.out.println(math(3,5));
        makeMusicians();
        makeSimpson();

    }
    public void makeSimpson(){
        Simpsons homer= new Simpsons("Homer",50,"Nuclear");
        System.out.println(homer.getName());
        homer.setName("Homer Simpson");//ismi değiştirmek istersek set ile değiştirebiliriz
        System.out.println(homer.getName());
    }



    public void makeMusicians(){
        Musicians james= new Musicians("james","Guitar",50);//obje oluşturduk
        System.out.println(james.instrument);
    }
    public void testMethod(){
        int x = 4*2;
        System.out.println("value of x: "+x);
    }
    public int math(int a,int b){


        return a+b;

    }




    @Override
    protected void onResume(){
        super.onResume();
        System.out.println("on resume called");
    }
    @Override
    protected void onStop(){
        super.onStop();
        System.out.println("on stop called");

    }
    @Override
    protected void onPause(){
        super.onPause();
        System.out.println("on pause called");
    }
}