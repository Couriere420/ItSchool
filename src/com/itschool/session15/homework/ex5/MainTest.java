package com.itschool.session15.homework.ex5;

public class MainTest {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Dog()};

        for (Animal animal : animals) {
            animal.sound();

        }
    }
}