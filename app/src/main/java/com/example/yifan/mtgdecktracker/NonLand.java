package com.example.yifan.mtgdecktracker;

import android.graphics.BitmapFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by Yifan on 5/21/2016.
 */
public class NonLand extends Card {
    public NonLand(String name, int cmc, String cost, String imageURL){
        this.name = name;
        this.cmc = cmc;
        this.cost = cost;
        this.imageURL = imageURL;
    }

    public boolean initializeImage() throws IOException {
        InputStream imageStream = new URL(getImageURL()).openStream();
        cardImage = BitmapFactory.decodeStream(imageStream);
        if(cardImage != null){
            return true;
        }
        else{
            return false;
        }
    }

    public String getName() {
        return this.name;
    }

    public int getCmc() {
        return cmc;
    }

    public String getCost() {
        return cost;
    }

    public String getImageURL() {
        return imageURL;
    }

}
