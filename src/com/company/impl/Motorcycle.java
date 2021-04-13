package com.company.impl;

public class Motorcycle extends Vehicle {
    private int maxSpeed;
    public Motorcycle (int wheelCount,int maxSpeed) {

        super(wheelCount);
        this.maxSpeed = maxSpeed;
    }

    @Override
    protected void printInfo() {
        System.out.println("Транспортное средство:" + "Количество колес: - " +  wheelCount + " " + "Максимальная скорость:" + " " +  maxSpeed);
    }
}
