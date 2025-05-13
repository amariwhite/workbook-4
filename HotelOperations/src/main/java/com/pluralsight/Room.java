package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return !occupied && !dirty;
    }

    public void checkIn() {
        if (!isAvailable()) {
            System.out.println("This room is now occupied");
            return;
        }
        occupied = true;
        dirty = true;
    }
    public void checkOut(){
        if (!occupied){
            System.out.println("This room is now available");
            return;
        }
        occupied = false;
    }
    public void cleanRoom(){
        dirty = false;
    }

}

