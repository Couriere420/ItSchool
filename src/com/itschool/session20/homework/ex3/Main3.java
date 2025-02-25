package com.itschool.session20.homework.ex3;

public class Main3 {
    public static void main(String[] args) {
        Student student1 = new Student("Ion", 45, "S1245630", "ionutz@gmail.com");
        Student student2 = new Student("Denis", 25, "S5462589", "denis@gmail.com");
        Student student3 = new Student("Ion", 45, "S1245630", "ionutz@gmail.com");

        System.out.println("student1.equals(student2): " + student1.equals(student2));
        System.out.println("student1.hashCode() == student2.hashCode(): " +
                (student1.hashCode() == student2.hashCode()));

        System.out.println("student1.equals(student3): " + student1.equals(student3));
        System.out.println("student1.hashCode() == student3.hashCode(): " +
                (student1.hashCode() == student3.hashCode()));
    }

}

