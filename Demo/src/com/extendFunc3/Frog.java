package com.extendFunc3;

public class Frog extends Animal {
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println("青蛙在吃虫");
    }
}
