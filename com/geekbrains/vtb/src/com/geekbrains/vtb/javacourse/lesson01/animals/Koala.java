package com.geekbrains.vtb.javacourse.lesson01.animals;

public class Koala extends Animal {

    public static int koalaCount;

    public Koala(String name) {
        koalaCount++;
        animalCount++;
        this.name = name;
        this.runningLimitation = 0;
        this.swimmingLimitation = 0;
    }

    public void run(int distance) {
        if (distance < 0) {
            System.out.println("Задано некорректное число");
        } else if (distance > runningLimitation) {
            System.out.println(name + " не умеет бегать.");
        } else {
            System.out.println(name + " пробежал(а) " + distance + " м.");
        }
    }

    public void swim(int meters) {
        if (meters < 0) {
            System.out.println("Задано некорректное число");
        } else if (meters > swimmingLimitation) {
            System.out.println(name + " не умеет плавать.");
        } else {
            System.out.println(name + " проплыл(а) " + meters + " м.");
        }
    }
}