package com.interfaceDemo1;

public class BasketBallSpoter extends Sporter {
    public BasketBallSpoter() {
    }

    public BasketBallSpoter(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员在学习打篮球");
    }
}
