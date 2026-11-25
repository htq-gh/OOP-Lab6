package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Cooper");
        Cat cat = new Cat("Daisy");

        System.out.println(dog.makeSound());
        System.out.println(cat.makeSound());
        System.out.println();

        Point point = new Point(12.5, 67.1);

        System.out.println("Current position: " + Arrays.toString(point.getPosition()));
        System.out.println();

        Smartphone phone = new Smartphone();

        phone.makeCall();
        phone.receiveCall();
        phone.moveTo(55.1, 32.9);
        System.out.println("GPS says that your position is: " + Arrays.toString(phone.getCoordinates()));
        System.out.println();

        Car carA = new Car("Авто 1", 18500, 2019, 285);
        Car carB = new Car("Авто 2", 34200, 2023, 190);

        System.out.println(carA.toString());
        System.out.println(carB.toString() + "\n");

        if (carA.compareTo(carB) < 0)
            System.out.println(carB.getName() + " більше за " + carA.getName());
        else if (carA.compareTo(carB) > 0)
            System.out.println(carA.getName() + " більше за " + carB.getName());
        else
            System.out.println("Характеристики " + carA.getName() + " та " + carB.getName() + " однакові");

        Car carC = new Car("Авто 3", 34200, 2023, 190);

        System.out.println("\n" + carC.toString() + "\n");

        if (carC.compareTo(carB) < 0)
            System.out.println(carB.getName() + " більше за " + carC.getName());
        else if (carC.compareTo(carB) > 0)
            System.out.println(carC.getName() + " більше за " + carB.getName());
        else
            System.out.println("Характеристики " + carC.getName() + " та " + carB.getName() + " однакові");

    }
}

