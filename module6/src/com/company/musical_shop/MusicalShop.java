package com.company.musical_shop;

import com.company.musical_shop.exceptions.NoInstrumentLeftException;
import com.company.musical_shop.exceptions.NoSuchInstrumentException;
import com.company.musical_shop.musical_instruments.MusicalInstrument;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MusicalShop {
    private List<MusicalInstrument> instruments;

    public List<MusicalInstrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(List<MusicalInstrument> instruments) {
        this.instruments = instruments;
    }

    public void addInstruments(List<MusicalInstrument> instruments) {
        for (MusicalInstrument instrument : instruments) {
            this.instruments.add(instrument);
        }
    }

    /**
     * returns list of ordered instruments that are exists in the shop and can be removed from the shop
     * @param order
     * @return
     * @throws NoInstrumentLeftException
     * @throws NoSuchInstrumentException
     */
    public List<MusicalInstrument> prepareInstruments(Map<String, Integer> order) throws NoInstrumentLeftException, NoSuchInstrumentException {
        List<MusicalInstrument> result = new ArrayList<>();

        for (Map.Entry<String, Integer> orderEntry : order.entrySet()) {
            String instrumentName = orderEntry.getKey();
            Integer numberOfInstrumentToBeRemoved = orderEntry.getValue();
            int numberOfInstrumentsRemoved = 0;

            for (MusicalInstrument instrument : this.getInstruments()) {
                if (instrument.getName().toLowerCase().equals(instrumentName.toLowerCase()) && numberOfInstrumentsRemoved < numberOfInstrumentToBeRemoved) {
                    result.add(instrument);
                    numberOfInstrumentsRemoved++;
                }
            }


            if (numberOfInstrumentsRemoved == 0)
                throw new NoSuchInstrumentException("There are no " + instrumentName + "s in the shop");
            else if (numberOfInstrumentsRemoved < numberOfInstrumentToBeRemoved)
                throw new NoInstrumentLeftException("Shop does not have enough " + instrumentName + "s");
        }

        return result;
    }

    /**
     * removes ordered instruments from the shop
     * @param order
     * @throws NoInstrumentLeftException
     * @throws NoSuchInstrumentException
     */
    private void removeInstrumentsFromTheShop (Map<String, Integer> order) throws NoInstrumentLeftException, NoSuchInstrumentException {

        for (Map.Entry<String, Integer> orderEntry : order.entrySet()) {
            String instrumentName = orderEntry.getKey();
            Integer numberOfInstrumentToBeRemoved = orderEntry.getValue();
            int numberOfInstrumentsRemoved = 0;
            Iterator<MusicalInstrument> iterator = this.getInstruments().iterator();
            while (iterator.hasNext()) {
                MusicalInstrument instrument = iterator.next();
                if (instrument.getName().toLowerCase().equals(instrumentName.toLowerCase()) && numberOfInstrumentsRemoved < numberOfInstrumentToBeRemoved) {
                    iterator.remove();
                    numberOfInstrumentsRemoved++;
                }
            }

            if (numberOfInstrumentsRemoved == 0)
                throw new NoSuchInstrumentException("There are no " + instrumentName + "s in the shop");
            else if (numberOfInstrumentsRemoved < numberOfInstrumentToBeRemoved)
                throw new NoInstrumentLeftException("Shop does not have enough " + instrumentName + "s");
        }

    }


}
