package com.rocket;

import java.util.Scanner;

public class TirgeTest {
    /*比较两只老虎的体重是否相同*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎体重：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二只老虎的体重：");
        int num2 = sc.nextInt();
        String result = num1 == num2 ? "相同" : "不相同";

        System.out.println("两只老虎的体重：" + result);
    }

}
