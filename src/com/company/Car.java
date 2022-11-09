package com.company;

public class Car extends Toy{
    private int wheelAmount;

    public Car(String name, int wheelAmount) {
        super(name);
        this.wheelAmount = wheelAmount;
    }

    @Override
    public void print() {
        System.out.println(getName()+" has "+wheelAmount+" wheels.");
    }
}
