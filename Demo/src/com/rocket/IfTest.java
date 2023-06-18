package com.rocket;

import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
//        小红的心理活动
//        小明的名次判断
        int ranking = 1;
        if (ranking == 1) {
            System.out.println("小红成为了小明的女友！");
        }
        boolean isGreen = false;
        boolean isYellow = false;
        boolean isRed = true;
        if (isGreen) {
            System.out.println("继续行驶！");
        }
        if (isYellow) {
            System.out.println("请减速！");
        }
        if (isRed) {
            System.out.println("请停车等待！");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数");
        int score = sc.nextInt();
        if (score < 60) {
            System.out.println("成绩不合格！");
        } else if (score > 150) {
            System.out.println("最高成绩不能高于150分！");
        } else {
            if (score <= 99 && score > 60) {
                System.out.println("你的成绩及格了！");
            } else if (score >= 100 && score < 150) {
                System.out.println("你真的太厉害了！");
            } else {
                System.out.println("你真的超神了！");
            }
        }

    }
}
