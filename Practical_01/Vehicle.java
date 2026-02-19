/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical1;

/**
 *
 * @author Ayushi
 */
abstract class Vehicle {
    String vehicleNo;
    double distance;
    private String engNo;

    public Vehicle(String vehicleNo, double distance, String engNo) {
        this.vehicleNo = vehicleNo;
        this.distance = distance;
        this.engNo = engNo;
    }

    public String getEngNo() {
        return engNo;
    }

    abstract double calculateFare();

    abstract void displayDetails();
}

class Cars extends Vehicle {

    double perKm;

    public Cars(double perKm, String vehicleNo, double distance, String engNo) {
        super(vehicleNo, distance, engNo);
        this.perKm = perKm;
    }

    @Override
    double calculateFare() {
        return perKm * distance;
    }

    @Override
    void displayDetails() {
        System.out.println("Vehicle Name: Car");
        System.out.println("Vehicle Number: " + vehicleNo);

        System.out.println("Distance: " + distance);
        System.out.println("Total Fare: " + calculateFare());
    }
}

class Bus extends Vehicle {

    int seatBooked;
    double ratePerseat;

    public Bus(int seatBooked, double ratePerseat, String vehicleNo, double distance, String engNo) {
        super(vehicleNo, distance, engNo);
        this.seatBooked = seatBooked;
        this.ratePerseat = ratePerseat;
    }

    @Override
    double calculateFare() {
        return seatBooked * ratePerseat;
    }

    @Override
    void displayDetails() {
        System.out.println("Vehicle Name: Bus");
        System.out.println("Vehicle Number: " + vehicleNo);
        System.out.println("Seat Booked: " + seatBooked);
        System.out.println("Total Fare: " + calculateFare());
    }
}

class Bike extends Vehicle {

    public Bike(String vehicleNo, double distance, String engNo) {
        super(vehicleNo, distance, engNo);
    }

    @Override
    double calculateFare() {
        return 40.0;
    }

    @Override
    void displayDetails() {
        System.out.println("Vehicle Name: Bike");
        System.out.println("Vehicle Number: " + vehicleNo);
        System.out.println("Fare: 40");
        System.out.println("Total Fare: " + calculateFare());
    }
}
