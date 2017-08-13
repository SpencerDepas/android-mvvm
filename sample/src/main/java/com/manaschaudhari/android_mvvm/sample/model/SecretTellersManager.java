package com.manaschaudhari.android_mvvm.sample.model;

import com.manaschaudhari.android_mvvm.sample.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SpencerDepas on 8/13/17.
 */

public class SecretTellersManager{

    private List<SecretTeller> secretTellers;

    public SecretTellersManager(){

        setSecretTellers(setUpModel());

    }

    public List<SecretTeller> getSecretTellers(){
        return secretTellers;
    }

    private void setSecretTellers(List<SecretTeller> secretTellers){
        this.secretTellers = secretTellers;
    }

    private List<SecretTeller> setUpModel(){

        List<SecretTeller> secretTellers =  new ArrayList<>();
        secretTellers.add(mayaModel());
        secretTellers.add(appieModel());
        secretTellers.add(zekeModel());


        return secretTellers;
    }




    private SecretTeller zekeModel() {
        SecretTeller maya = new SecretTeller();
        maya.setName("ZEKE");
        maya.setAge(27);
        maya.setBio("is an American figure painter, muralist, " +
                "graffiti artist and graphic novelist of Korean" +
                " descent.[1] His figure paintings, which explore " +
                "themes of desire, degradation, and exaltation, are " +
                "characterized by a raw, frenetic tone that he has" +
                " termed \"dirty style.\"[2] In the graffiti world, he " +
                "is identified with[3] the bucktoothed whale[4] he has been" +
                " spray-painting on the streets since he was in his teens.");
        maya.setCostForSecret(10);
        maya.setPicture(R.drawable.spencer);
        return maya;
    }

    private SecretTeller appieModel() {
        SecretTeller maya = new SecretTeller();
        maya.setName("Appie Saud");
        maya.setAge(31);
        maya.setBio("is an American figure painter, muralist, " +
                "graffiti artist and graphic novelist of Korean" +
                " descent.[1] His figure paintings, which explore " +
                "themes of desire, degradation, and exaltation, are " +
                "characterized by a raw, frenetic tone that he has" +
                " termed \"dirty style.\"[2] In the graffiti world, he " +
                "is identified with[3] the bucktoothed whale[4] he has been" +
                " spray-painting on the streets since he was in his teens.");
        maya.setCostForSecret(10);
        maya.setPicture(R.drawable.appie);
        return maya;
    }

    private SecretTeller mayaModel() {
        SecretTeller maya = new SecretTeller();
        maya.setName("Maya-Lina");
        maya.setAge(24);
        maya.setBio("is an American figure painter, muralist, " +
                "graffiti artist and graphic novelist of Korean" +
                " descent.[1] His figure paintings, which explore " +
                "themes of desire, degradation, and exaltation, are " +
                "characterized by a raw, frenetic tone that he has" +
                " termed \"dirty style.\"[2] In the graffiti world, he " +
                "is identified with[3] the bucktoothed whale[4] he has been" +
                " spray-painting on the streets since he was in his teens.");
        maya.setCostForSecret(10);
        maya.setPicture(R.drawable.maya);
        return maya;
    }
}
