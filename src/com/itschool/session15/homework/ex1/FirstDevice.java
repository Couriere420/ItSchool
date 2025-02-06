package com.itschool.session15.homework.ex1;

public class FirstDevice implements Notification {
    @Override
    public void sendMessage() {
        System.out.println("Message sent through first device");
    }
}