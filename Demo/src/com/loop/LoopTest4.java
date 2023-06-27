package com.loop;

import java.util.Scanner;

public class LoopTest4 {
    public static void main(String[] args) {
//        键盘录入一个正整数，判断这个数是否为质数
//        质数：如果一个整数只能被1和本身整数，那这个整数就是质数。否则这个数就是合数。

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        boolean flag = true;
        int num = sc.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(num + "是一个质数");
        } else {
            System.out.println(num + "不是一个质数");
        }

    }
}
