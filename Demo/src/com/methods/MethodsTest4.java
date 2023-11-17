package com.methods;

import java.util.Scanner;

public class MethodsTest4 {
    public static void main(String[] args) {
        /*机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。按照如下规则计算机票价格:旺季 (5-10月)头等舱9折，经济舱8.5折，淡季(11月到来年4月)头等舱7折，经济舱6.5折。*/
        //分析:
        //1.键盘录入机票原价、月份、头等舱或经济舱
        //2.先判断月份是旺季还是淡季
        // 3.继续判断当前机票是经济舱还是头等舱

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价");
        double ticket = sc.nextInt();
        System.out.println("请输入当前月份");
        int month = sc.nextInt();
        System.out.println("请输入当前购买的舱位 0 头等舱 1经济舱");
        int set = sc.nextInt();

        if (month >= 5 && month <= 10) {
            System.out.print("当前月份属于旺季，");
//            旺季
            ticket = ticketResult(ticket, set, 0.9, 0.85);
//            if (set == 0) {
//                ticket = (int) (ticket * 0.9);
//            } else if (set == 1) {
//                ticket = (int) (ticket * 0.85);
//            } else {
//                System.out.println("没有这个舱位");
//            }
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            System.out.print("当前月份属于淡季，");
//            淡季
            ticket = ticketResult(ticket, set, 0.7, 0.65);
//            if (set == 0) {
//                ticket = (int) (ticket * 0.7);
//            } else if (set == 1) {
//                ticket = (int) (ticket * 0.65);
//            } else {
//                System.out.println("没有这个舱位");
//            }
        } else {
            System.out.println("输入的月份不合法");
        }
        System.out.println("当前的机票价格是：" + ticket);
    }

    public static double ticketResult(double price, int set, double agr1, double agr2) {
        if (set == 0) {
            price = (int) (price * agr1);
        } else if (set == 1) {
            price = (int) (price * agr2);
        } else {
            System.out.println("没有这个舱位");
        }
        return price;
    }

}

