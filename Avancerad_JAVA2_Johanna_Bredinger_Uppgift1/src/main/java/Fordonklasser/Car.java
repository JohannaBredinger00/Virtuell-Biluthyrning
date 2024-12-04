package Fordonklasser;

public class Car extends Vehicle{
    private int doors; //antal dörrar på en bil

    //konstruktor
    public Car(String model, String registrationNumber, double rentalPricePerDay, int doors){
        super(model, registrationNumber, rentalPricePerDay);
        this.doors = doors;
    }

    // Implementera den abstrakta metoden
    @Override
    public void displayDetails() {
        System.out.println("Car Model: " + getModel());
        System.out.println("Registration Number: " + getRegistrationNumber());
        System.out.println("Rental Price Per Day: " + getRentalPricePerDay());
        System.out.println("Number of Doors: " + doors);

    }
}
