package com.company;

public abstract class Toy implements Printable {
    private String name;

    public Toy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
