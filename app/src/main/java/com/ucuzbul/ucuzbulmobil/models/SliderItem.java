package com.ucuzbul.ucuzbulmobil.models;

public class SliderItem {

    String imageURL;
    String description;


    public SliderItem(String imageURL, String description) {
        this.imageURL = imageURL;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getImageURL() {
        return imageURL;
    }
}
