package com.example.a8866352155.beaconrestaurant.MenuRecyclerActivity;

/**
 * Created by 8866352155 on 3/6/2017.
 */

public class Food {

    private int image;
    private String name;


    public Food(int image, String name) {
        this.image = image;
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
