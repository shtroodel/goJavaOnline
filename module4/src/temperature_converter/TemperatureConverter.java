package temperature_converter;

public class TemperatureConverter {

    public double fahrenheitToCelsius(double fahrenheit){
        return (5.0 / 9.0) * (fahrenheit - 32);
    }

    public double celsiusToFahrenheit(double celsius){
        return (9.0 / 5.0) * celsius + 32;
    }
}
