package com.geekbrains.vtb.javacourse.lesson01.animals;

public class Beaber extends Animal {

    public static int beaberCount;

    public Beaber(String name) {
        beaberCount++;
        animalCount++;
        this.name = name;
        this.runningLimitation = 1;
        this.swimmingLimitation = 500;
    }
}