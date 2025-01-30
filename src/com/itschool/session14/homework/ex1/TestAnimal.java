package com.itschool.session14.homework.ex1;

public class TestAnimal {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Wolf()};  //polymorphism

        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
