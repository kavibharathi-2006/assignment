class Vehicle {
    String brand;
    int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

class Car extends Vehicle {
    int doors;

    public Car(String brand, int year, int doors) {
        super(brand, year);
        this.doors = doors;
    }

    public void showCarDetails() {
        displayInfo();
        System.out.println("Doors: " + doors);
    }
}

class Bike extends Vehicle {
    boolean hasGear;

    public Bike(String brand, int year, boolean hasGear) {
        super(brand, year);
        this.hasGear = hasGear;
    }

    public void showBikeDetails() {
        displayInfo();
        System.out.println("Has Gear: " + hasGear);
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022, 4);
        Bike bike = new Bike("Yamaha", 2023, true);

        car.showCarDetails();
        System.out.println();
        bike.showBikeDetails();
    }
}
