package com.company.module4.temperature_converter;

public class TemperatureConverter {

    public double fahrenheitToCelsius(double fahrenheit){
        return (5.0 / 9.0) * (fahrenheit - 32);
    }  // магические числа, которые повторяются 2 раза в коде. можно присвоить константам и использовать их в формулах

    public double celsiusToFahrenheit(double celsius){
        return (9.0 / 5.0) * celsius + 32;
    }
}
