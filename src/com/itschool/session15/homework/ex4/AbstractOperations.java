package com.itschool.session15.homework.ex4;

public abstract class AbstractOperations {

    public AbstractOperations() {
        System.out.println("This is constructor of abstract class");
    }

    protected abstract void aMethod();

    public void aMethod1() {
        System.out.println("This is a normal method of abstract class");
    }


}
