package com.innerClass;

public class CarTest {
    public static void main(String[] args) {
        Car c = new Car("塞那", "白色", 400000);
        Car.Motor m = new Car.Motor("x5000", 345);

        c.show();
        m.show();
    }
}