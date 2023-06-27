package com.loop;

public class LoopTest2 {
    public static void main(String[] args) {
        //逢7过的游戏

        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
