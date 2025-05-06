package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType.toLowerCase();
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }
    public double getPrice() {
        double basePrice = 0;
        if ("king".equals(roomType)) {
            basePrice = 139.00;
        } else if ("double".equals(roomType)) {
            basePrice = 124.00;
        }
        if (isWeekend) {
            basePrice *= 1.10;
        }
        return basePrice;
    }
    public double getReservationTotal(){
        return getPrice() * numberOfNights;
    }
}
