package com.itschool.session15.homework.ex1;

public class MainTest {
    public static void main(String[] args) {
        Notification firstNotification = new FirstDevice();
        Notification secondNotification = new SecondDevice();
        firstNotification.sendMessage();
        secondNotification.sendMessage();
    }
}
