package com.geekbrains.vtb.javacourse.lesson01.animals;

public abstract class Animal {

    public static int animalCount;

    protected int runningLimitation;
    protected int swimmingLimitation;
    protected String name;

    public void run(int distance) {
        if (distance < 0) {
            System.out.println("Задано некорректное число");
        } else if (distance > runningLimitation) {
            System.out.println(name + " не смог(ла) справиться с дистанцией.");
        } else {
            System.out.println(name + " пробежал(а) " + distance + " м.");
        }
    }

    public void swim(int meters) {
        if (meters < 0) {
            System.out.println("Задано некорректное число");
        } else if (meters > swimmingLimitation) {
            System.out.println(name + " не смог(ла) справиться с дистанцией.");
        } else {
            System.out.println(name + " проплыл(а) " + meters + " м.");
        }
    }
}