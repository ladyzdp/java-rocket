package com.string;

public class StringTest {
    public static void main(String[] args) {
        String name = "亚洲舞王.尼古拉斯.赵四";
        System.out.println(name);

        String name2 = new String("1qaz@WSX");
        System.out.println("@" + name2 + "!");

        char[] chs = {'1', '2', '3', '4'};
        String s1 = new String(chs);
        System.out.println(s1);

        String s2 = "A123";
        String s3 = "a123";
        boolean result = s2.equals(s3);
        boolean result1 = s2.equalsIgnoreCase(s3);
        System.out.println(result);
        System.out.println(result1);
    }
}
