package com.geekbrains.vtb.javacourse.lesson01.animals;

public class Dog extends Animal {

    public static int dogCount;

    public Dog(String name) {
        dogCount++;
        animalCount++;
        this.name = name;
        this.runningLimitation = 500;
        this.swimmingLimitation = 10;
    }
}