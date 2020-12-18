package com.example.androidappstorepc;

public class Game {
    private String name;
    private String describe;
    private int image;
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getDescribe()
    {
        return this.describe;
    }
    public void setDescribe(String describe)
    {
        this.describe=describe;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", describe='" + describe + '\'' +
                ", image='" + image + '\'' +
                '}';
    }

    public Game(String name, String describe, int image) {
        this.name = name;
        this.describe = describe;
        this.image = image;
    }
}
