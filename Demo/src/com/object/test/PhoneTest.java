package com.object.test;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone();

        p1.name = "苹果";
        p1.price = 7999.00;
        p1.call();
        p1.playGame();

        Phone p2 = new Phone();
        p2.name = "遥遥领先";
        p2.price = 12999.00;

        p2.call();
        p2.playGame();
    }
}
