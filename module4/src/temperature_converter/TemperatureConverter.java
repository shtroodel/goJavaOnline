package temperature_converter;

public class TemperatureConverter {

    public double fahrenheitToCelsius(double fahrenheit){
        return (5 / 9) * (fahrenheit - 32);
    }

    public double celsiusToFahrenheit(double celsius){
        return (9 / 5) * celsius + 32;
    }
}
