package com.manaschaudhari.android_mvvm.sample.model;

import android.databinding.BaseObservable;

/**
 * Created by SpencerDepas on 8/13/17.
 */

public class Person extends BaseObservable {

    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
