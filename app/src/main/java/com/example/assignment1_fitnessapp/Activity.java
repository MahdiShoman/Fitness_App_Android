package com.example.assignment1_fitnessapp;

public class Activity {
    String name;
    int time;
    String description;
    int image;
    String gifImage;

    public Activity(String name, int time, String description, int image) {
        this.name = name;
        this.time = time;
        this.description = description;
        this.image = image;
    }

    public Activity(String name, int time, String description, int image, String gifImage) {
        this.name = name;
        this.time = time;
        this.description = description;
        this.image = image;
        this.gifImage = gifImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getGifImage() {
        return gifImage;
    }

    public void setGifImage(String gifImage) {
        this.gifImage = gifImage;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "name='" + name + '\'' +
                ", time=" + time +
                ", description='" + description + '\'' +
                ", image=" + image +
                '}';
    }
}
