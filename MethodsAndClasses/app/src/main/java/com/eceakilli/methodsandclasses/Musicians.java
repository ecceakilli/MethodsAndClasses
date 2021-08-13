package com.eceakilli.methodsandclasses;

import androidx.annotation.NonNull;

public class Musicians {
    String name;
    String instrument;
    int age;
    String name1;
    String surname1;

    public Musicians(String name, String instrument, int age) {
        this.name = name;
        this.instrument = instrument;
        this.age = age;
        System.out.println("contructer called");
    }

}
