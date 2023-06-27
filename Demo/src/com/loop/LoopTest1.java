package com.loop;

public class LoopTest1 {
    //    小老虎在减肥，最多只能吃三个包子
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("小老虎吃了" + i + "个包子");

            if (i == 3) {
                System.out.println("小老虎不能再吃了，每次只能吃三个包子");
                break;
            }
        }
    }
}
