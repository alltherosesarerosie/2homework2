package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Toy[] toys = {createObject(createToy()), createObject(createToy()), createObject(createToy())};
        for (Toy t: toys) {
            t.print();
        }

    }

    private static int createToy(){
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                please enter:
                1 --> doll
                2 --> constructor
                3 --> teddy bear
                4 --> car\s""");

        return sc.nextInt();
    }


    private static Toy createObject(int className){
        Scanner sc = new Scanner(System.in);
        Toy toy = new Toy(null) {
            @Override
            public void print() {
                System.out.println("an Error");
            }
        };
        switch (className) {
            case 1 -> {
                System.out.println("enter a name and color of hair for doll");
                String dollName = sc.nextLine();
                String colorHair = sc.nextLine();
                return new Doll(dollName, colorHair);
            }
            case 2 -> {
                System.out.println("enter a name and amount of details for cons");
                String nameCons = sc.nextLine();
                int amountDetail = sc.nextInt();
                return new Constructor(nameCons, amountDetail);
            }
            case 3 -> {
                System.out.println("enter a name and size for Teddy bear");
                String nameTeddy = sc.nextLine();
                String sizeTeddy = sc.nextLine();
                return new Teddy(nameTeddy, sizeTeddy);
            }
            case 4 -> {
                System.out.println("enter a name and amount of wheels for car");
                String nameCar = sc.nextLine();
                int amountWheels = sc.nextInt();
                return new Car(nameCar, amountWheels);
            }
        }
        return toy;
    }
}
