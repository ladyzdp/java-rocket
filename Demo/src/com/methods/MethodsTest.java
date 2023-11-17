package com.methods;

public class MethodsTest {
    public static void main(String[] args) {
        playGame();
        total(10, 20);
        double area1 = getArea(1.5, 3.5);
        double area2 = getArea(1.8, 2.5);
        if (area1 > area2) {
            System.out.println("第一个长方形面积大");
        } else {
            System.out.println("第二个长方形面积大");
        }
        compare(12.5, 13.5);
    }

    public static void playGame() {
        System.out.println("选人物");
        System.out.println("准备开局");
        System.out.println("对线");
        System.out.println("崩盘");
        System.out.println("骂队友");
        System.out.println("送人头");
        System.out.println("GG");
    }

    public static void total(int a, int b) {
        System.out.println("结果两个数的结果是：" + (a + b));
    }

    public static double getArea(double a, double b) {
        double result = a * b;
        System.out.println("长方形的面积是：" + result);
        return result;
    }

    public static void compare(int a1, int a2) {
        System.out.println("int");
        System.out.println(a1 == a2);
    }

    public static void compare(short s1, int s2) {
        System.out.println("short");
        System.out.println(s1 == s2);
    }

    public static void compare(double d1, double d2) {
        System.out.println("double");
        System.out.println(d1 == d2);
    }

    public static void compare(long n1, int n2) {
        System.out.println("long");
        System.out.println(n1 == n2);
    }
}
