package com.geekbrains.vtb.javacourse.lesson01;

import com.geekbrains.vtb.javacourse.lesson01.animals.*;

import java.util.Random;

import static com.geekbrains.vtb.javacourse.lesson01.animals.Animal.animalCount;
import static com.geekbrains.vtb.javacourse.lesson01.animals.Beaber.beaberCount;
import static com.geekbrains.vtb.javacourse.lesson01.animals.Dog.dogCount;
import static com.geekbrains.vtb.javacourse.lesson01.animals.Koala.koalaCount;
import static com.geekbrains.vtb.javacourse.lesson01.animals.Tiger.tigerCount;

public class Main {

    /*
    1. Создать классы Собака, Домашний Кот, Тигр, Животное (можете добавить два-три своих класса).
    2. Животные могут бежать и плыть. В качестве аргумента каждому методу передается длина препятствия.
    3. У каждого животного есть ограничения на действия (бег: кот — 200 м, собака — 500 м;
    плавание: кот — не умеет плавать, собака — 10 м). Результатом выполнения действия будет печать в консоль.
    Например: dogBobik.run(150); -> 'Бобик пробежал 150 м'.
    4. Создать один массив с животными и заставляете их по очереди пробежать дистанцию и проплыть.
    5. * Добавить подсчет созданных Домашних Котов, Тигров, Собак, Животных.
     */

    public static void main(String[] args) {
        Animal[] animals = createAnimals();
        makeAnimalsMove(animals);
        System.out.println();
        printAnimalCountInfo();
    }

    public static Animal[] createAnimals() {

        return new Animal[] { new DomesticCat("Вася"),
                new Dog("Одри"),
                new Dog("Тор"),
                new Dog("Тяпа"),
                new DomesticCat("Симба"),
                new Koala("Инь-Ян"),
                new Tiger("Тигран"),
                new Beaber("Джастин")
        };
    }

    public static void makeAnimalsMove(Animal[] animals) {
        for (Animal animal : animals) {
            animal.run(new Random().nextInt(-50, 501));
            animal.swim(new Random().nextInt(-50, 501));
            System.out.println();
        }
    }

    public static void printAnimalCountInfo() {
        System.out.println("Всего животных: " + animalCount);
        System.out.println("Котиков: " + DomesticCat.catCount);
        System.out.println("Собак: " + dogCount);
        System.out.println("Тигров: " + tigerCount);
        System.out.println("Бобров: " + beaberCount);
        System.out.println("Коал: " + koalaCount);
    }
}
