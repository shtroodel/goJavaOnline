package com.company.musical_shop.exceptions;

public class NoSuchInstrumentException extends Exception {
    public NoSuchInstrumentException (String s) {
        System.out.println(s);
    }
}
