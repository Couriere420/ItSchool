package com.itschool.session20.homework.ex1;

public class MainTest {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5, 8);
        Rectangle rect2 = new Rectangle(5, 8);
        Rectangle rect3 = new Rectangle(4, 10);

        System.out.println("rect1.equals(rect2): " + rect1.equals(rect2));
        System.out.println("rect1.hashCode() == rect2.hashCode(): " + (rect1.hashCode() == rect2.hashCode()));
        System.out.println("rect1.equals(rect3): " + rect1.equals(rect3));
        System.out.println("rect1.hashCode() == rect3.hashCode(): " + (rect1.hashCode() == rect3.hashCode()));
    }
}
