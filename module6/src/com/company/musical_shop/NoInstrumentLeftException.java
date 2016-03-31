package com.company.musical_shop;

public class NoInstrumentLeftException extends Exception {
    NoInstrumentLeftException(String s) {
        System.out.println(s);
    }
}
