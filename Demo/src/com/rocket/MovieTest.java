package com.rocket;

import java.util.Scanner;

public class MovieTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个座号");
        int ticket = sc.nextInt();
        if (ticket >= 0 && ticket <= 100) {
            if (ticket % 2 == 1) {
                System.out.println("座左边");
            } else {
                System.out.println("座右边");
            }
        } else {
            System.out.println("座号错误");
        }

    }
}
