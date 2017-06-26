package com.example.parkminhyun.trackengine;

/**
 * Created by 12aud on 2017-06-26.
 */

public class Subject {

    public Subject(String num, String name){
        this.num = num;
        this.name = name;
    }

    private String num;
    private String name;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
