package com.loop;

import java.util.Random;

public class LoopTest5 {
    public static void main(String[] args) {
        Random r = new Random();
//        生成随机数 范围是从0开始
//        包头不包尾，包左不包右
        int num = r.nextInt(10) + 1;
        System.out.println(num);

    }
}
