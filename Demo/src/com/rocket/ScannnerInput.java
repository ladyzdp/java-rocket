package com.rocket;

import java.util.Scanner;

public class ScannnerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数");
        int num = sc.nextInt();
        System.out.println(num);
    }
}