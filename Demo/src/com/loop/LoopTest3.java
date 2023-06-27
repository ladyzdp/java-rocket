package com.loop;

import java.util.Scanner;

public class LoopTest3 {
    public static void main(String[] args) {
//        录入一个数字大于等于2的整数X,计算结果并返回X的平方根。结果只保留整数部分，小数部分舍去

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个整数");
        int num = sc.nextInt();


        for (int i = 1; i < num; i++) {
            if (i * i == num) {
                System.out.println(i + "就是" + num + "的平方根");
                break;
            } else if (i * i > num) {
                System.out.println((i - 1) + "就是" + num + "平方根的整数部分");
                break;
            }

        }
    }
}
