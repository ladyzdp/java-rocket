package com.string;

import java.util.Scanner;

public class StringTest1 {
    public static void main(String[] args) {
        System.out.println("请键盘录入一些字符");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        int otherCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= 'a' && charAt <= 'z') {
                smallCount++;
            } else if (charAt >= 'A' && charAt <= 'Z') {
                bigCount++;
            } else if (charAt >= '0' && charAt <= '9') {
                numberCount++;
            } else {
                otherCount++;
            }

        }
        System.out.println("大写字母有：" + smallCount + "个");
        System.out.println("小写字母有：" + bigCount + "个");
        System.out.println("数字有：" + numberCount + "个");
        System.out.println("其它字符有：" + otherCount + "个");
    }
}
