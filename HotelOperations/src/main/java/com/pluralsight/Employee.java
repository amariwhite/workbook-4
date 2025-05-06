package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {
   private String employeeId;
   private String name;
   private String department;
   private double payRate;
   private double hoursWorked;

   private double punchInTime;

   public Employee(String employeeId, String name, String department, double payRate, double hoursWorked) {
      this.employeeId = employeeId;
      this.name = name;
      this.department = department;
      this.payRate = payRate;
      this.hoursWorked = hoursWorked;
   }
   public double getTotalPay() {
      return getRegularHours() * payRate + getOverTimeHours() * 1.5;
   }
   public double getRegularHours(){
      return Math.min(40, hoursWorked);
   }
   public double getOverTimeHours(){
      return Math.max(0, hoursWorked - 40);
   }
   public void punchIn(double time){
      if (punchInTime != 0) {
         System.out.println("You punched in at: " + punchInTime);
         return;
      }
      punchInTime = time;
      LocalDateTime now = LocalDateTime.now();
      punchOut(now.getHour() + now.getMinute() / 60.0);
      System.out.println("You punched out at: " + now.getHour() + now.getMinute() / 60.0);
   }
   public void punchOut(double time){
      if (punchInTime == 0) {
         System.out.println("You punched out at: " + time);
      }
      if (time < punchInTime) {
         System.out.println("Punch out time is before punch in time");
         return;
      }
      double duration = time - punchInTime;
      hoursWorked += duration;
      punchInTime = 0;

      LocalDateTime now = LocalDateTime.now();
      double time2 = now.getHour() + now.getMinute() / 60.0;
      System.out.println("You punched out at: " + now.getHour() + now.getMinute() / 60.0);

   }
}
