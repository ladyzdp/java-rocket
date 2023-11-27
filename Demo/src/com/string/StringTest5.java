package com.string;

import java.util.Scanner;

public class StringTest5 {
    public static void main(String[] args) {
        //创建对象

        StringBuilder sb = new StringBuilder("abc");
        sb.append("qazwsx");
        sb.reverse();
        String str = sb.toString();
        System.out.println(sb);
        System.out.println(str.toUpperCase());
        System.out.println(sb.length());

        String strs = getString();

        System.out.println(strs);
    }

    public static String getString() {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        return str;
    }
}
