package com.array;

public class ArrayTest {
    public static void main(String[] args) {
        int[] age = {11, 12, 13, 14};
        String[] name = {"张三", "李四", "王五", "赵六"};
        double[] height = {175, 183, 186, 196};
        for (int i = 0; i < age.length; i++) {
            System.out.println("学生的姓名：" + name[i] + "\t" + "年龄：" + age[i] + "\t" + "身高：" + height[i] + " CM");
        }
    }
}
