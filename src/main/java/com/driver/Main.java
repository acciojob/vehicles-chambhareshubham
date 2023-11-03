package com.driver;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);
        Boat b1 = new Boat("farrari",8);
        System.out.print(b1.getVehicleName());
    }
}