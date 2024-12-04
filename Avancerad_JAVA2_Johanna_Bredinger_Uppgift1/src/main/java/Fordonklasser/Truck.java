package Fordonklasser;

public class Truck extends Vehicle{
    private double loadCapacity;

    //skapa konstruktor
    public Truck(String model, String registrationNumber, double rentalPricePerDay, double loadCapacity){
        super(model, registrationNumber, rentalPricePerDay);
        this.loadCapacity = loadCapacity;
    }
    
    @Override
    public void displayDetails() {
        System.out.println("Truck Model: " + getModel());
        System.out.println("Registration Number: " + getRegistrationNumber());
        System.out.println("Rental Price Per Day: " + getRentalPricePerDay());
        System.out.println("Load Capacity (tons): " + getloadCapacity());

    }

    private double getloadCapacity() {
        return loadCapacity;
    }


}
