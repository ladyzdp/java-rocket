package com.loop;

public class LoopTest {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("第" + i + "个包子有虫子，不能吃");
                continue;
            }
            System.out.println("小老虎吃到了第" + i + "个包子");
        }
    }
}
