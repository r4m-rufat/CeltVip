package com.codingwithrufat.celttask.models;

public class Category {
    private String title;
    private int image;

    public Category(String title, int image) {
        this.image = image;
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
