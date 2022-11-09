package com.company;

public class Constructor extends Toy {
    private int detailAmount;

    public Constructor(String name, int detailAmount) {
        super(name);
        this.detailAmount = detailAmount;
    }

    @Override
    public void print() {
        System.out.println(getName()+" has "+detailAmount+" details");
    }
}
