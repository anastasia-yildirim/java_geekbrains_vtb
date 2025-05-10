package com.geekbrains.vtb.javacourse.lesson01.animals;

public class Koala extends Animal {

    public static int koalaCount;

    public Koala(String name) {
        koalaCount++;
        animalCount++;
        this.name = name;
        this.maxRunDistance = 0;
        this.maxSwimDistance = 0;
    }

    public void run(int distance) {
        if (distance < 0) {
            System.out.println("Задано некорректное число");
        } else if (distance > maxRunDistance) {
            System.out.println(name + " не умеет бегать.");
        } else {
            System.out.println(name + " пробежал(а) " + distance + " м.");
        }
    }

    public void swim(int distance) {
        if (distance < 0) {
            System.out.println("Задано некорректное число");
        } else if (distance > maxSwimDistance) {
            System.out.println(name + " не умеет плавать.");
        } else {
            System.out.println(name + " проплыл(а) " + distance + " м.");
        }
    }
}
