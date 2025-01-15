package com.itschool.session10.homework.ex1;

public class ShoppingList {
    public static void main(String[] args) {
        String[] shoppingList = {"eggs", "salt", "carrot", "milk"};
        System.out.println("shoppingList;");
        for (int i = 0; i < shoppingList.length; i++) {
            System.out.println((i + 1) + ". " + shoppingList[i]);
        }
    }
}
