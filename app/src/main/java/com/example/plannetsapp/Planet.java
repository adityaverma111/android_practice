package com.example.plannetsapp;
//this class is acting as Model class for our listview
public class Planet {
    //Attributes
    private  String planetName;
    private String MoonCount;

    private int planetImage;

    //Constructor
    public Planet(String planetName, String moonCount, int planetImage) {
        this.planetName = planetName;
        this.MoonCount = moonCount;
        this.planetImage = planetImage;
    }

   //Getter and setter


    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String getMoonCount() {
        return MoonCount;
    }

    public void setMoonCount(String moonCount) {

        MoonCount = moonCount;
    }

    public int getPlanetImage() {
        return planetImage;
    }

    public void setPlanetImage(int planetImage) {
        this.planetImage = planetImage;
    }
}
