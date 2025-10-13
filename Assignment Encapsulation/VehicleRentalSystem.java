import java.util.*;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    private String policyNumber = "CAR123";

    public Car(String num, double rate) {
        super(num, "Car", rate);
    }

    double calculateRentalCost(int days) {
        return days * getRentalRate();
    }

    public double calculateInsurance() {
        return 2000;
    }

    public String getInsuranceDetails() {
        return "Car insurance policy: " + policyNumber;
    }
}

class Bike extends Vehicle implements Insurable {
    private String policyNumber = "BIKE456";

    public Bike(String num, double rate) {
        super(num, "Bike", rate);
    }

    double calculateRentalCost(int days) {
        return days * getRentalRate() * 0.8;
    }

    public double calculateInsurance() {
        return 500;
    }

    public String getInsuranceDetails() {
        return "Bike insurance policy: " + policyNumber;
    }
}

class Truck extends Vehicle implements Insurable {
    private String policyNumber = "TRUCK789";

    public Truck(String num, double rate) {
        super(num, "Truck", rate);
    }

    double calculateRentalCost(int days) {
        return days * getRentalRate() * 1.5;
    }

    public double calculateInsurance() {
        return 3000;
    }

    public String getInsuranceDetails() {
        return "Truck insurance policy: " + policyNumber;
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("C101", 1500));
        vehicles.add(new Bike("B202", 500));
        vehicles.add(new Truck("T303", 2500));
        for (Vehicle v : vehicles) {
            double rent = v.calculateRentalCost(5);
            double insurance = ((Insurable) v).calculateInsurance();
            System.out.println(v.getType() + " Total: Rent=" + rent + " Insurance=" + insurance);
        }
    }
}
