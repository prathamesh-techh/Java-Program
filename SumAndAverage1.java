import java.util.Scanner; 

public class SumAndAverage1 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // int is a primitive data type used to store whole numbers
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt(); 

        // int array to store multiple integer values
        int[] numbers = new int[size];

        // 'sum' will hold the total sum of the array elements
        int sum = 0;

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt(); // input each integer
            sum += numbers[i]; // add current number to sum
        }

        // double is used to store decimal values for more precise average
        double average = (double) sum / size;

        // Display results
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

        scanner.close();
    }
}
