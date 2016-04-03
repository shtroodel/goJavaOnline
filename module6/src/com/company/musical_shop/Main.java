package com.company.musical_shop;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<MusicalInstrument> instruments = new ArrayList<>();

        instruments.add(new Guitar());
        instruments.add(new Guitar());
        instruments.add(new Guitar());

        instruments.add(new Piano());
        instruments.add(new Piano());

        instruments.add(new Trumpet());
        instruments.add(new Trumpet());
        instruments.add(new Trumpet());
        instruments.add(new Trumpet());

        MusicalShop shop = new MusicalShop();
        shop.setMusicalInstruments(instruments);




    }
}
