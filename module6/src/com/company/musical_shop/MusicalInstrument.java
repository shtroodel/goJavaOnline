package com.company.musical_shop;

public class MusicalInstrument {
    protected String name;
    protected int cost;
    protected String manufacturer;

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
