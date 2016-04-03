package com.company.musical_shop;

public class MusicalInstrument {

    protected int cost;
    protected String manufacturer;


    public int getCost() {
        return cost;
    }

    public String getManufacturer() {
        return manufacturer;
    }


    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
