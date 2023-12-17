package com.extendFunc2;

public class Cat extends Animal {
    public Cat(int age, String color) {
        super(age, color);
    }

    public Cat() {
    }

    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的猫咪侧着头吃" + something);
    }

    public void catchMouse() {
        System.out.println("猫咪抓老鼠");
    }
}
