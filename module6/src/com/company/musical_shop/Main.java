package com.company.musical_shop;

import com.company.musical_shop.exceptions.NoInstrumentLeftException;
import com.company.musical_shop.exceptions.NoSuchInstrumentException;
import com.company.musical_shop.musical_instruments.Guitar;
import com.company.musical_shop.musical_instruments.MusicalInstrument;
import com.company.musical_shop.musical_instruments.Piano;
import com.company.musical_shop.musical_instruments.Trumpet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws NoInstrumentLeftException, NoSuchInstrumentException {

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
        shop.setInstruments(instruments);

        Map<String, Integer> order1 = new HashMap<>();

        order1.put("Guitar", 2);
        order1.put("Piano", 3);
        order1.put("Trumpet", 2);

        Map<String, Integer> order2 = new HashMap<>();

        order2.put("Guitar", 2);
        order2.put("Balalayka", 3);
        order2.put("Trumpet", 2);


        List<MusicalInstrument> preparedInstruments2 = shop.prepareInstruments(order2);


    }
}
