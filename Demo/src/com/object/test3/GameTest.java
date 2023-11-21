package com.object.test3;

public class GameTest {
    public static void main(String[] args) {
        Role r1 = new Role("张无忌", 100, '男');
        Role r2 = new Role("灭绝师太", 100, '女');
//        开始格斗
        r1.showInfo();
        System.out.println();
        r2.showInfo();
        while (true) {
            r1.tackle(r2);
            if (r2.getBlood() == 0) {
                System.out.println();
                System.out.println(r1.getName() + "KO了" + r2.getName());
                break;
            }

            r2.tackle(r1);
            if (r1.getBlood() == 0) {
                System.out.println();
                System.out.println(r2.getName() + "KO了" + r1.getName());
                break;
            }
        }
    }
}
