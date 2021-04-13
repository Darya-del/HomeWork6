package com.company.impl;

import com.company.api.Costable;

public class Car extends Vehicle implements Costable {
    private int doorsCount;
    private int Cost;
    public Car (int wheelCount, int doorsCount, int Cost) {
        super(wheelCount);
        this.doorsCount = doorsCount;
        this.Cost = Cost;

    }

   @Override
    protected void printInfo() {
        System.out.println("Транспортное средство:" +"Количество колес: - " + wheelCount + " " + "Количество дверей:"+ " " + doorsCount  + " " + "Цена:" + Cost);
    }

    @Override
    public int getCost() {
        return  Cost;
    }

}
