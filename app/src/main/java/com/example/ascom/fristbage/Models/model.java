package com.example.ascom.fristbage.Models;

/**
 * Created by ascom on 08/03/2018.
 */

public class model  {
    String name;
    String img;
    String imgprofle;
    String video;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getImgprofle() {
        return imgprofle;
    }

    public void setImgprofle(String imgprofle) {
        this.imgprofle = imgprofle;
    }


    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public model(String name, String img, String imgprofle, String video) {

        this.name = name;
        this.img = img;
        this.imgprofle = imgprofle;
        this.video = video;
    }
}
