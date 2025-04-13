package com.geekbrains.vtb.javacourse.lesson01.animals;

public class Tiger extends Animal {

    public static int tigerCount;

    public Tiger(String name) {
        tigerCount++;
        animalCount++;
        this.name = name;
        this.runningLimitation = 350;
        this.swimmingLimitation = 200;
    }
}