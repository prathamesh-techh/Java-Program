import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Celsius temperature
        System.out.println("Enter Temperature in Celsius:");
        double celsius = scanner.nextDouble(); // use lowercase 

        // Convert to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        scanner.close();
    }
}
