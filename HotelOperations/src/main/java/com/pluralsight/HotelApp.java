package com.pluralsight;

public class HotelApp {
    public static void main(String[] args) {

        Room room = new Room(2, 124.00, false, false);
        System.out.println("Room Available: " + room.isAvailable());

        Reservation reservation = new Reservation("king", 3, true);
//        System.out.println("Reservation Total: $" + reservation.getReservationTotal());
        System.out.printf("Reservation Total: $%.2f%n", reservation.getReservationTotal());

        Employee employee = new Employee("J640280", "Craig", "Front Desk",20,40);
        employee.punchIn(12.50);
        employee.punchOut(14.00);
//        System.out.println("Hours worked: %.2f, Total Pay: $%.2f, " + employee.getRegularHours() + employee.getTotalPay());
        System.out.printf("Hours worked: %.2f, Total Pay: $%.2f%n", employee.getRegularHours(), employee.getTotalPay());


    }
}
