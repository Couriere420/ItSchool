package com.itschool.session10.homework.ex2;

public class ChristmasWishlist {
    public static void main(String[] args) {
        String[] wishlist = {"G-Class", "House", "Wife", "Money"};
        System.out.println("wishlistForChristmas");
        for (int i = 0; i < wishlist.length; i++) {
            System.out.println((i + 1) + ". " + wishlist[i]);
        }
    }
}
