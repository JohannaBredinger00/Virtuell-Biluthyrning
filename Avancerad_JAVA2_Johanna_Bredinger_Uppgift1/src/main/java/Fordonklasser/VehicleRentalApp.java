package Fordonklasser;

public class VehicleRentalApp {
    public static void main(String[] args) {
                // Skapa instanser av olika fordon
                Vehicle car = new Car("Toyota Corolla", "ABC123", 50.0, 4);
                Vehicle suv = new SUV("Jeep Wrangler", "XYZ789", 100.0, true);
                Vehicle truck = new Truck("Volvo FH", "LMN456", 150.0, 20.0); // Lastkapacitet i ton
                Vehicle convertible = new Convertible("Mazda MX-5", "OPQ123", 75.0, true);

                // Beräkna hyreskostnad för varje fordon och visa detaljer
                int rentalDays = 5;

                // Hyra ut fordon
                car.rentOut(rentalDays);
                suv.rentOut(rentalDays);
                truck.rentOut(rentalDays);
                convertible.rentOut(rentalDays);

                // Visa fordonsdetaljer
                System.out.println("\nCar rental details:");
                car.displayDetails();
                System.out.println("Total rental cost for: " + rentalDays + " days: " + car.calculateRentalCost(rentalDays));

                System.out.println("\nSUV rental details:");
                suv.displayDetails();
                System.out.println("Total rental cost for: " + rentalDays + " days: " + suv.calculateRentalCost(rentalDays));

                System.out.println("\nTruck rental details:");
                truck.displayDetails();
                System.out.println("Total rental cost for: " + rentalDays + " days: " + truck.calculateRentalCost(rentalDays));

                System.out.println("\nConvertible rental details:");
                convertible.displayDetails();
                System.out.println("Total rental cost for: " + rentalDays + " days: " + convertible.calculateRentalCost(rentalDays));

                // Returnera fordon
                car.returnVehicle();
                suv.returnVehicle();
                truck.returnVehicle();
                convertible.returnVehicle();
            }
        }


