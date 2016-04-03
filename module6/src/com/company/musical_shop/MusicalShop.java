package com.company.musical_shop;

import javax.sound.midi.MidiChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MusicalShop {
    private List<MusicalInstrument> musicalInstruments;

    public List<MusicalInstrument> getMusicalInstruments() {
        return musicalInstruments;
    }

    public void setMusicalInstruments(List<MusicalInstrument> musicalInstruments) {
        this.musicalInstruments = musicalInstruments;
    }

    public void addInstruments(List<MusicalInstrument> musicalInstruments) {
        for (MusicalInstrument instrument : musicalInstruments) {
            this.musicalInstruments.add(instrument);
        }
    }

    public List<MusicalInstrument> prepareInstruments(Map<String, Integer> order) throws NoInstrumentLeftException , NoSuchInstrumentException {
        List<MusicalInstrument> result = new ArrayList<>();

        for (Map.Entry<String, Integer> orderEntry : order.entrySet()) {
            String instrumentName = orderEntry.getKey();
            Integer numberOfInstrumentToBeRemoved = orderEntry.getValue();
            int numberOfInstrumentsRemoved = 0;

            for (MusicalInstrument instrument : this.getMusicalInstruments()) {
                if (instrument.getName().equals(instrumentName) && numberOfInstrumentsRemoved < numberOfInstrumentToBeRemoved) {
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

    private void removeInstrumentsFromTheShop (Map<String, Integer> order) {

        for (Map.Entry<String, Integer> orderEntry : order.entrySet()) {
            String instrumentName = orderEntry.getKey();
            Integer numberOfInstrumentToBeRemoved = orderEntry.getValue();
            int numberOfInstrumentsRemoved = 0;
            Iterator<MusicalInstrument> iterator = this.getMusicalInstruments().iterator();
            while (iterator.hasNext()) {
                MusicalInstrument instrument = iterator.next();
                if (instrument.getName().equals(instrumentName) && numberOfInstrumentsRemoved < numberOfInstrumentToBeRemoved) {
                    iterator.remove();
                    numberOfInstrumentsRemoved++;
                }
            }
        }

    }


}
