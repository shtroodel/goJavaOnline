package com.company.module4;

import com.company.module4.distance_between_points.Distance;
import com.company.module4.distance_between_points.Point;
import com.company.module4.square.Circle;
import com.company.module4.square.Rectangle;
import com.company.module4.square.Square;
import com.company.module4.square.Triangle;
import com.company.module4.temperature_converter.TemperatureConverter;

public class Main {

    public static void main(String[] args) {

        System.out.println("Square of triangle 5x4 = " + new Square().square(new Triangle(5, 4)));
        System.out.println("Square of rectangle 6x2 = " + new Square().square(new Rectangle(6, 2)));
        System.out.println("Square of circle with radius 7 = " + new Square().square(new Circle(7)));

        System.out.println("50 celsius degrees = " + new TemperatureConverter().celsiusToFahrenheit(50) + " fahrenheit degrees");
        System.out.println("50 fahrenheit degrees = " + new TemperatureConverter().fahrenheitToCelsius(50) + " celsius degrees");

        System.out.println("Distance between point1(3, 5) and point2(7, 12) = " + new Distance().distance(new Point(3, 5), new Point(7, 12)));
    }
}
