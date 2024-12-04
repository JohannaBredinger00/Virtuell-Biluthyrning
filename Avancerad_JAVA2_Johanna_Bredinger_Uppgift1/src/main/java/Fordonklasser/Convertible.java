package Fordonklasser;

public class Convertible extends Vehicle{
    private boolean hasHardTop;

    //skapa konstruktor
    public Convertible(String model, String registrationNumber, double rentalPricePerDay, boolean hasHardTop){
        super(model, registrationNumber, rentalPricePerDay);
        this.hasHardTop = hasHardTop;
    }


    @Override
    public void displayDetails() {
        System.out.println("SUV Model: " + getModel());
        System.out.println("Registration Number: " + getRegistrationNumber());
        System.out.println("Rental Price Per Day: " + getRentalPricePerDay());
        System.out.println("Has Hard Top: " + (hasHardTop ? "Yes" : "No"));
    }
}
