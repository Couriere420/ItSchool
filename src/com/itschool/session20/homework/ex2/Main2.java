package com.itschool.session20.homework.ex2;

public class Main2 {
    public static void main(String[] args) {
        Person person1 = new Person("Constantin", 28, "contantin@gmail.com");
        Person person2 = new Person("Constantin", 28, "constantin@gmail.com");
        Person person3 = new Person("Alex", 35, "alex@yahoo.com");

        System.out.println("person1.equals(person2): " + person1.equals(person2));
        System.out.println("person1.hashCode() == person2.hashCode(): " + (person1.hashCode() == person2.hashCode()));
        System.out.println("person1.equals(person3): " + person1.equals(person3));
        System.out.println("person1.hashCode() == person3.hashCode(): " + (person1.hashCode() == person3.hashCode()));
    }
}
