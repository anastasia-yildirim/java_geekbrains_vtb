package com.geekbrains.vtb.javacourse.lesson01.animals;

public abstract class Animal {

    public static int animalCount;

    protected int maxRunDistance;
    protected int maxSwimDistance;
    protected String name;

    public void run(int distance) {
        if (distance < 0) {
            System.out.println("Задано некорректное число");
        } else if (distance > maxRunDistance) {
            System.out.println(name + " не смог(ла) справиться с дистанцией.");
        } else {
            System.out.println(name + " пробежал(а) " + distance + " м.");
        }
    }

    public void swim(int distance) {
        if (distance < 0) {
            System.out.println("Задано некорректное число");
        } else if (distance > maxSwimDistance) {
            System.out.println(name + " не смог(ла) справиться с дистанцией.");
        } else {
            System.out.println(name + " проплыл(а) " + distance + " м.");
        }
    }
}
