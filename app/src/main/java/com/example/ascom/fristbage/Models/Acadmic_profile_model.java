package com.example.ascom.fristbage.Models;

/**
 * Created by AsMaa on 2/17/2018.
 */

public class Acadmic_profile_model {
    String name;
    int img;


    public Acadmic_profile_model(String name, int img) {
        this.name = name;
        this.img = img;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }


}

