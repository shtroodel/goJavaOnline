package com.company.musical_shop.exceptions;

public class NoInstrumentLeftException extends Exception {
    public NoInstrumentLeftException(String s) {
        System.out.println(s);
    }
}
