package com.string;

import java.util.Scanner;

public class StringTest8 {
    public static void main(String[] args) {
        System.out.println("请输入数字");
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        System.out.println(num);
        boolean flag = checkStr(num);
        if(flag){
            for (int i = 0; i < num.length(); i++) {
                char item = num.charAt(i);
                System.out.print(revString(item));
            }
        }else{
            System.out.println("当前的字符串不符合规则，请重新输入");
        }

    }

    public static String revString(char num) {
        String str;
        switch (num) {
            case '1':
                str = "Ⅰ";
                break;
            case '2':
                str = "Ⅱ";
                break;
            case '3':
                str = "Ⅲ";
                break;
            case '4':
                str = "Ⅳ";
                break;
            case '5':
                str = "Ⅴ";
                break;
            case '6':
                str = "Ⅵ";
                break;
            case '7':
                str = "Ⅶ";
                break;
            case '8':
                str = "Ⅷ";
                break;
            case '9':
                str = "Ⅸ";
                break;
            default:
                str = "";
                break;
        }
        return str;
    }

    public static boolean checkStr(String str) {
        if (str.length() > 9) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char item = str.charAt(i);
            if (item < '0' || item > '9') {
                return false;
            }
        }
        return true;
    }
}
