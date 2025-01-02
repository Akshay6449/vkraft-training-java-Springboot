package BasicJavaDay1;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();
        double fahrenheit = scanner.nextDouble();

        convertCelsiusToFahrenheit(celsius);
        convertFahrenheitToCelsius(fahrenheit);
        scanner.close();
    }

    public static void convertCelsiusToFahrenheit(double celsius) {

        double fahrenheit = celsius * (9.0 / 5) + 32;
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
    }

    public static void convertFahrenheitToCelsius(double fahrenheit) {

        double celsius = (fahrenheit - 32) * (5.0 / 9);
        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");
    }
}
