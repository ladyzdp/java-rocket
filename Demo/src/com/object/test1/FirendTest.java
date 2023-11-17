package com.object.test1;

public class FirendTest {
    public static void main(String[] args) {
        Firend f1 = new Firend();
        f1.name = "赵四";
        f1.age = 35;
        f1.gender = "亚洲人气舞王";
        System.out.println(f1.name);
        System.out.println(f1.age);
        System.out.println(f1.gender);
        f1.eat();
        f1.sleep();


        Firend f2 = new Firend();
        f2.name = "刘能";
        f2.age = 45;
        f2.gender = "青年婚姻理事会会长";
        System.out.println(f2.name);
        System.out.println(f2.age);
        System.out.println(f2.gender);
        f2.eat();
        f2.sleep();
    }
}
