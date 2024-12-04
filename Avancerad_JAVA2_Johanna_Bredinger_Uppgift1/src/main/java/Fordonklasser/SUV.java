package Fordonklasser;

public class SUV extends Vehicle{
    private boolean fourWheelDrive;

    //skapa konstruktor
    public SUV(String model, String registrationNumber, double rentalPricePerDay,boolean fourWheelDrive){
        super(model, registrationNumber, rentalPricePerDay);
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public void displayDetails() {
        System.out.println("SUV Model: " + getModel());
        System.out.println("Registration Number: " + getRegistrationNumber());
        System.out.println("Rental Price Per Day: " + getRentalPricePerDay());
        System.out.println("Four Wheel Drive: " + (fourWheelDrive ? "Yes" : "No"));

    }
}
