package com.extendFunc3;

public class AnimalTest {
    public static void main(String[] args) {
        Frog f = new Frog("小绿", 1);
        System.out.println(f.getName() + "," + f.getAge() + "岁");
        f.drink();
        f.eat();

        System.out.println("----------------");

        Cat c = new Cat("小花", 2);
        System.out.println(c.getName() + "," + c.getAge() + "岁");
        c.drink();
        c.eat();
        System.out.println("----------------");

        Dog d = new Dog("小犬", 2);
        System.out.println(d.getName() + "," + d.getAge() + "岁");
        d.drink();
        d.eat();
    }
}
