package Fordonklasser;

abstract class Vehicle implements Rentable {
    private String model;
    private String registrationNumber;
    private double rentalPricePerDay;
    private boolean isRented; //används för att hålla koll på om fordonet är uthyrt

    //skapa konstruktor
    public Vehicle(String model, String registrationNumber, double rentalPricePerDay){
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.rentalPricePerDay = rentalPricePerDay;
        this.isRented = false; //används för att berätta att första instansen inte är uthyrd
    }

    //skapa Getter och Setter
    public String getModel(){
        return model;
    }

    public String getRegistrationNumber(){
        return registrationNumber;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public boolean isRented(){
        return isRented;
    }

    //skapa metod för att hyra ut fordonet
    @Override
    public void rentOut(int days){
        if (!isRented){
            isRented = true;
            System.out.println("The vehicle" + model + " (" + registrationNumber + ") is rented for" + days + "days");
        }else {
            System.out.println("The vehicle is already rented");
        }
    }

    //skapa metod för att retunera fordonet
    @Override
    public void returnVehicle(){
        if (!isRented){
            isRented = false;
            System.out.println("The vehicle" + model + " (" + registrationNumber + ") has been returned.");
        }else {
            System.out.println("The vehicle is not currently rented.");
        }
    }


    //skapa metod för att beräkna hyreskostnaden baserat på antla dagar
    @Override
    public double calculateRentalCost(int days){
        return rentalPricePerDay * days;
    }

    //skapa en abstrakt metod för att visa fordonets detaljer
    public abstract void displayDetails();


}
