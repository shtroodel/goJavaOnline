import square.Circle;
import square.Rectangle;
import square.Square;
import square.Triangle;
import temperature_converter.TemperatureConverter;

public class Main {

    public static void main(String[] args) {

        System.out.println("Square of triangle 5x4 = " + new Square().square(new Triangle(5, 4)));
        System.out.println("Square of rectangle 6x2 = " + new Square().square(new Rectangle(6, 2)));
        System.out.println("Square of circle with radius 7 = " + new Square().square(new Circle(7)));

        System.out.println("50 celsius degrees = " + new TemperatureConverter().celsiusToFahrenheit(50) + " fahrenheit degrees");
        System.out.println("50 fahrenheit degrees = " + new TemperatureConverter().fahrenheitToCelsius(50) + " celsius degrees");

        
    }
}
