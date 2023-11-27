package com.string;

import java.util.Scanner;

public class StringTest7 {
    public static void main(String[] args) {
        System.out.println("请输入字符");
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println("字符反转：" + rotate(str));
        System.out.println(toNumber("123", "456"));
    }

    public static String rotate(String str) {
        //字符反转
        char[] arr = str.toCharArray();
        char first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;
        String result = new String(arr);
        return result;
    }

    public static int toNumber(String str1, String str2) {
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int result = num1 * num2;
        return result;

    }

}
