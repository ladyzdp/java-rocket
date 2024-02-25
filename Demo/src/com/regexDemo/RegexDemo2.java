package com.regexDemo;

public class RegexDemo2 {
    public static void main(String[] args) {
        String str = "我我喜欢长长长长的铁铁铁铁路。";


        String result = str.replaceAll("(.)\\1+", "$1"); //捕获第一个分组并且重复第一个分组

        System.out.println(result);
    }
}
