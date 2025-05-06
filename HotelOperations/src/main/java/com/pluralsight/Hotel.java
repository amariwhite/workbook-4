package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfRooms;
    private int numberOfSuites;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfRooms, int numberOfSuites) {
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.numberOfSuites = numberOfSuites;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }
    public Hotel(String name, int numberOfRooms, int numberOfSuites, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.numberOfSuites = numberOfSuites;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }
    public boolean bookRoom(int numberOfRooms, boolean isSuite){
        if (isSuite){
            if(getAvailableSuites() >= numberOfRooms){
                bookedSuites += numberOfRooms;
                return true;
            }
        }else {
            if(getAvailableRooms() >= numberOfRooms){
                bookedBasicRooms += numberOfRooms;
                return true;
            }
        }
        return false;
    }
    public int getAvailableRooms(){
        return numberOfRooms - bookedBasicRooms;
    }
    public int getAvailableSuites(){
        return numberOfSuites - bookedSuites;
    }
}
