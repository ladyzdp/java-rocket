package com.rocket;

import java.util.Scanner;

public class OperatorsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int num = sc.nextInt();


        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;

        System.out.println("各位：" + ge);
        System.out.println("十位：" + shi);
        System.out.println("百位：" + bai);
    }
}
