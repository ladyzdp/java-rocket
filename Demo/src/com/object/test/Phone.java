package com.object.test;

public class Phone {

    String name;
    double price;

    public void call() {
        System.out.println(name + "手机正在打电话");
    }

    public void playGame() {
        System.out.println("价值 " + price + "的 " + name + "手机正在玩游戏");
    }
}
