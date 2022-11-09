package com.company;

public class Doll extends Toy{
    private String hairColor;

    public Doll(String name, String hairColor) {
        super(name);
        this.hairColor = hairColor;
    }

    @Override
    public void print() {
        System.out.println(getName()+" has "+hairColor+" color of hair");
    }
}
