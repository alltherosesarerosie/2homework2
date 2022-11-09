package com.company;

public class Teddy extends Toy{
    private String size;

    public Teddy(String name, String size) {
        super(name);
        this.size = size;
    }

    @Override
    public void print() {
        System.out.println(getName()+" "+size+" size");
    }
}
