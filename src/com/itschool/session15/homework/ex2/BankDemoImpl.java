package com.itschool.session15.homework.ex2;

public class BankDemoImpl {
    public static void main(String[] args) {
        Bank bank = new BankAImpl();
        Bank bank1 = new BankBImpl();
        Bank bank2 = new BankCImpl();
        System.out.println("Balance in BankA: $" + bank.getBalance());
        System.out.println("Balance in BankB: $" + bank1.getBalance());
        System.out.println("Balance in BankC: $" + bank2.getBalance());

    }
}
