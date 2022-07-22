package com.kenzie.library;

public class Wagon {
    //declare properties
    private int capacity;
    private Traveler[] passengers;

    //declare constructors
    public Wagon(int capacity) {
        this.capacity = capacity;
        this.passengers = new Traveler[capacity];
    }

    //declare methods
    public int getAvailableSeatCount() {
        int openSeats = 0;

        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] == null) {
                openSeats += 1;
            }
        }
        return openSeats;
    }

    public void join(Traveler traveler) {

        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] == null) {
                passengers[i] = traveler;
                break;
            }
        }
    }

    public boolean shouldQuarantine() {
        boolean isSick = false;

        for (Traveler traveler : passengers) {
            if (traveler != null) {
                if (!traveler.getIsHealthy()) {
                    isSick = true;
                }
            }
        }
        return isSick;
    }

    public int totalFood() {
        int totalFoodAmount = 0;
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] != null) {
                totalFoodAmount += passengers[i].getFood();
            }
        }
        return totalFoodAmount;
    }

    public void loadWagon(int numTravelers, int numHunters, int numDoctors) {

        for (int i = 0; i < numTravelers; i++) {
            Traveler traveler = new Traveler();
            this.join(traveler);

        }
        for (int i = 0; i < numDoctors; i++) {
            Doctor doctor = new Doctor();
            this.join(doctor);
        }
        for (int i = 0; i < numHunters; i++) {
            Hunter hunter = new Hunter();
            this.join(hunter);
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Traveler[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Traveler[] passengers) {
        this.passengers = passengers;
    }
}
