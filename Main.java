// Base class named Vehicle
class Vehicle {

    // Method to start the vehicle
    // Return type: void (does not return anything)
    void start() {
        System.out.println("Vehicle started."); 
    }
}

// Subclass Car that extends Vehicle
class Car extends Vehicle {

    // Overriding the start() method of Vehicle
    // Return type: void
    @Override
    void start() {
        System.out.println("Car started."); 
    }
}

// Subclass Motorcycle that extends Vehicle
class Motorcycle extends Vehicle {

    // Overriding the start() method of Vehicle
    // Return type: void
    @Override
    void start() {
        System.out.println("Motorcycle started."); 
    }
}

// Class Garage for servicing vehicles
class Garage {

    // Method to service any Vehicle
    // Parameter: Vehicle object (can be Car or Motorcycle due to polymorphism)
    // Return type: void
    void serviceVehicle(Vehicle vehicle) {
        vehicle.start(); 
        System.out.println("Vehicle serviced.");
    }
}

// Main class where execution starts
public class Main {

    // main() method – entry point of Java application
    // Return type: void
    public static void main(String[] args) {

        // Creating an instance of Car
        Car car = new Car(); 

        // Creating an instance of Motorcycle
        Motorcycle motorcycle = new Motorcycle(); 

        // Creating an instance of Garage
        Garage garage = new Garage(); 

        // Calling serviceVehicle() method with Car object
        garage.serviceVehicle(car);

        // Calling serviceVehicle() method with Motorcycle object
        garage.serviceVehicle(motorcycle); 
    }
}
