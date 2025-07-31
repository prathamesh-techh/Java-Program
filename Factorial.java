public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        int i = 1;
        int fact = 1;

        do {
            fact = fact * i;
            i++;
        } while (i <= number);

        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
