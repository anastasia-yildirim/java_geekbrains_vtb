package com.geekbrains.vtb.javacourse.lesson01.animals;

public class DomesticCat extends Animal {

    public static int catCount;

    public DomesticCat(String name) {
        catCount++;
        animalCount++;
        this.name = name;
        this.runningLimitation = 200;
        this.swimmingLimitation = 0;
    }

    @Override
    public void swim(int distance) {
        if (distance < 0) {
            System.out.println("Задано некорректное число");
        } else if (distance > swimmingLimitation) {
            System.out.println(name + " не умеет плавать.");
        } else {
            System.out.println(name + " проплыл(а) " + distance + " м.");
        }
    }
}