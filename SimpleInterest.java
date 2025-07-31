import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input principal and time
        System.out.println("Enter the principal amount:");
        double principal = sc.nextDouble();  

        System.out.println("Enter the time in years:");
        double time = sc.nextDouble();

        double rate;

        // Determine interest rate using if-else
        if (principal > 10000) {
            rate = 10.0;
        } else if (principal >= 5000 && principal <= 10000) {
            rate = 8.0;
        } else {
            rate = 5.0;
        }

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Output result
        System.out.println("Interest Rate: " + rate + "%");
        System.out.println("Simple Interest = " + simpleInterest);

        sc.close();
    }
}
