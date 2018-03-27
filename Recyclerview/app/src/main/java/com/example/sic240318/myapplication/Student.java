package com.example.sic240318.myapplication;

/**
 * Created by SIC240318 on 3/24/2018.
 */

public class Student {
    private int imgAvata;
    private int numberSize;
    private String name;

    public int getImgAvata() {
        return imgAvata;
    }

    public void setImgAvata(int imgAvata) {
        this.imgAvata = imgAvata;
    }

    public int getNumberSize() {
        return numberSize;
    }

    public void setNumberSize(int numberSize) {
        this.numberSize = numberSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int imgAvata, int numberSize, String name) {
        this.imgAvata = imgAvata;
        this.numberSize = numberSize;
        this.name = name;
    }
}

