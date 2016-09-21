package com.twotowerstudio.testingapp;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

/**
 * Created by Panther II on 12/09/2016.
 */

public class Card {
    private String header;
    private String subtitle;
    private int imageId;
    private String barColor;

    public Card(){

    }
    public Card(String header, String subtitle, int imageId, String barColor){
        this.header = header;
        this.subtitle = subtitle;
        this.imageId = imageId;
        this.barColor = barColor;

    }

    public String getHeader(){
        return header;
    }
    public String getSubtitle(){
        return subtitle;
    }
    public int getImageId(){
        return imageId;
    }
    public String getBarColor(){
        return barColor;
    }
    public void setHeader(String header){
        this.header = header;
    }
    public void setSubtitle(String subtitle){
        this.subtitle = subtitle;
    }
    public void setImageId(int imageId){
        this.imageId = imageId;
    }
    public void setBarColor(String barColor){
        this.barColor = barColor;
    }
}
