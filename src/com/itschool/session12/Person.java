package com.itschool.session12;

public class Person {
    String firstName;
    String lastName;
    String sex;
    int age;
    String dateOfBirth;
    String cnp;
    String address;

    Person(String firstName, String lastName, String sex, int age, String dateOfBirth, String cnp, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.cnp = cnp;
        this.address = address;
    }
}