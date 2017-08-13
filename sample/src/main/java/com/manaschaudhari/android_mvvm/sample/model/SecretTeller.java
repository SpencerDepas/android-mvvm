package com.manaschaudhari.android_mvvm.sample.model;

/**
 * Created by SpencerDepas on 8/13/17.
 */

public class SecretTeller extends Person {

    private String bio;
    private int picture;
    private int costForSecret;

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public int getCostForSecret() {
        return costForSecret;
    }

    public void setCostForSecret(int costForSecret) {
        this.costForSecret = costForSecret;
    }
}
