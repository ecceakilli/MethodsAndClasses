package com.eceakilli.methodsandclasses;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("on create called");
        testMethod();
        System.out.println(math(74,66));
        makeMusicians();
        makeSimpsons();
        makeGetterSetter();

    }
    ///////////////////////////////////////////

    //class için oluşturlan method
    //2 farklı yol vardır.
    public void makeMusicians(){
       //1 //instance(obje)
        Musicians ece=new Musicians("akıllı","klarnet",25);
       //2
        ece.name1="ece";
        ece.surname1="akıllı";
        System.out.println(ece.name1+ ece.surname1);
    }
    public void makeSimpsons(){
        Simpsons homer=new Simpsons("ece","akıllı",25);
        homer.age=51;
        System.out.println(homer.age);

    }
    ///////////////////////////////////////////////
    //getter setter
    public void makeGetterSetter(){
        GetterSetter familiy=new GetterSetter("MEHMET","ARIÖZ",26);
        System.out.println(familiy.getName());
        familiy.setName("ECE");
        System.out.println(familiy.getName()+" "+familiy.getSurname());
    }
    //////////////////////////////////////////////

    public void testMethod(){
        int i =5+5;
        System.out.println("deger:"+i);
    }
    public int math(int x, int y){
        return x+y;
    }
    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("on resume called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("on stop called");
    }

}