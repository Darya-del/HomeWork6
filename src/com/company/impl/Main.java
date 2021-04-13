package com.company.impl;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car(4, 4, 125);
        Car car2 = new Car(8, 2, 500);
        Motorcycle mc1 = new Motorcycle(2, 200);
        Motorcycle mc2 = new Motorcycle(3, 300);

        car1.printInfo();
        car2.printInfo();

        System.out.println("Цена " + car1.getCost());
        System.out.println("Цена " + car2.getCost());


        mc1.printInfo();
        mc2.printInfo();


    }
}
