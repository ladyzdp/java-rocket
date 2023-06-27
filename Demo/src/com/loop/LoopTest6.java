package com.loop;

import java.util.Random;
import java.util.Scanner;

public class LoopTest6 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("请输入你要猜的数据");
            int target = sc.nextInt();
            count++;
            if (count == 3) {
                System.out.println("猜中了");
                break;
            }

            if (target > num) {
                System.out.println("猜大了");
            } else if (target < num) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜中了");
                break;
            }
        }


    }
}
