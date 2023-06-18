package com.rocket;

import java.util.Scanner;

public class FashionTest {
    /*
     * 相亲游戏，输入你和对方的时髦程度，如果你的时髦程度大于对方的时髦程度，你们匹配成功，否则匹配失败；
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的时髦程度：");
        int myFashion = sc.nextInt();
        System.out.println("请输入对方时髦程度：");
        int sheFashion = sc.nextInt();

        boolean result = myFashion > sheFashion;

        System.out.println("你们的匹配结果是：" + result);

    }
}
