package com.pluralsight;

public class HotelApp {
    public static void main(String[] args) {

        Room room = new Room(2, 124.00, false, false);
        System.out.println("Room Available: " + room.isAvailable());

        Reservation reservation = new Reservation("king", 3, true);
        System.out.println("Reservation Total: $" + reservation.getReservationTotal());

        Employee employee = new Employee("J640280", "Craig", "Front Desk",20,40);
        System.out.println("Total Pay :$" + employee.getTotalPay());

    }
}
