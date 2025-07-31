import java.util.Random;

class Rectangle {
    int length;
    int width;

    // Constructor that accepts length and width
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    int calculateArea() {
        return length * width;
    }
}

public class Assignment1 {
    public static void main(String[] args) {
        Random random = new Random();

        // Instantiate two Rectangle objects with random values (1 to 40)
        int length1 = random.nextInt(40) + 1;
        int width1 = random.nextInt(40) + 1;
        Rectangle rectangle1 = new Rectangle(length1, width1);

        int length2 = random.nextInt(40) + 1;
        int width2 = random.nextInt(40) + 1;
        Rectangle rectangle2 = new Rectangle(length2, width2);

        // Calculate areas
        int area1 = rectangle1.calculateArea();
        int area2 = rectangle2.calculateArea();

        // Print details
        System.out.println("Rectangle1: Length = " + length1 + ", Width = " + width1 + ", Area = " + area1);
        System.out.println("Rectangle2: Length = " + length2 + ", Width = " + width2 + ", Area = " + area2);

        // Compare using relational operator
        if (area1 > area2) {
            System.out.println("Rectangle1 > Rectangle2");
        } else if (area1 < area2) {
            System.out.println("Rectangle1 < Rectangle2");
        } else {
            System.out.println("They are equal");
        }
    }
}
