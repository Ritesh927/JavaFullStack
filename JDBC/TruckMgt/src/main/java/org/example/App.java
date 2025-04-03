package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;

public class App {

    public static void main(String[] args) {

        TruckService truckService = new TruckService();

        Truck tata = new Truck("TATA", "2019", 1000, "Rajesh");
        Truck volvo = new Truck("VOLVO", "2023", 1000, "Akash");
        Truck eicher = new Truck("EICHER", "2022", 1000, "Hasshit");

        // Adding data into database
        System.out.println("Adding data.......");
        truckService.addTruck(tata);
        truckService.addTruck(volvo);
        truckService.addTruck(eicher);

        //Fetch
        System.out.println("Fetching data by id......." + 1);
        Truck truck = truckService.getTruckById(1);
        System.out.println("Truck data: " + truck);

        //Updating truck data
        System.out.println("Updating data by id......." + 1);
        truck.setDriverName("Ramesh");
        truckService.updateTruck(truck);
        System.out.println("Updated truck data: " + truckService.getTruckById(1));

        //Get all truk data
        System.out.println("Fetching all data.......");
        List<Truck> allTrucks = truckService.getAllTrucks();
        System.out.println("All trucks in DB: ");

        for (Truck truck1 : allTrucks) {
            System.out.println(truck1);
        }

        //Delete truck data
        System.out.println("Deleting data by id......." + 2);
        truckService.deleteTruck(2);
        System.out.println("Data deleted by id : " + 2);

        System.out.println("Getting all data.....");
        allTrucks = truckService.getAllTrucks();
        System.out.println("All trucks after all operations : ");
        System.out.println(allTrucks);
    }
}
