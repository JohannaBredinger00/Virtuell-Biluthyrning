package Fordonklasser;

public interface Rentable {

    //skapa metod för att hyra ut fordon
    void rentOut(int days);

    //skapa metod för att retunera fordon
    void returnVehicle();

    //skapa metod för att beräkna hyreskostnaden
    double calculateRentalCost(int days);

}
