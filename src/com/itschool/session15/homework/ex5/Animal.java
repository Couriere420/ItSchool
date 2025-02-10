package com.itschool.session15.homework.ex5;

public abstract class Animal {

    protected abstract void cat();

    protected abstract void dog();

    public void sound() {
        cat();
        dog();

    }
}