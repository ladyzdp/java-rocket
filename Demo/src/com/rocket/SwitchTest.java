package com.rocket;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入星期");
        int week = sc.nextInt();

        switch (week) {
            case 1:
                System.out.println("今天跑步");
                break;
            case 2:
                System.out.println("今天骑行");
                break;
            case 3:
                System.out.println("今天打篮球");
                break;
            case 4:
                System.out.println("今天踢足球");
                break;
            case 5:
                System.out.println("今天打羽毛球");
                break;
            case 6:
                System.out.println("今天溜冰");
                break;
            case 7:
                System.out.println("休息一下吧");
                break;
            default:
                System.out.println("输入错啦");
                break;
        }
    }
}
