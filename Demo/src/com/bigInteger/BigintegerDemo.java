package com.bigInteger;

import java.math.BigInteger;
import java.util.Random;

public class BigintegerDemo {
    public static void main(String[] args) {
        Random r = new Random();
        //获取一个随机大整数
        BigInteger bd1 = new BigInteger(4, r);
        System.out.println("生成的最大数字是：" + bd1);

        // 获取一个指定大整数
        BigInteger bd2 = new BigInteger("1000000000");
        System.out.println(bd2);

        BigInteger num1 = new BigInteger("1324567809876543");
        BigInteger num2 = new BigInteger("3245645562356234");

        // 大整数相加
        BigInteger sum = num1.add(num2);
        System.out.println("Sum:" + sum);
        //    大整数相乘
        BigInteger product = num1.multiply(num2);
        System.out.println("Product:" + product);
        //    比较两个大整数
        int result = num1.compareTo(num2);
        System.out.println("num1.compareTo(num2) Result" + result);
        if (result < 0) {
            System.out.println("num1 小于 num2");
        } else if (result > 0) {
            System.out.println("num1 大于 num2");
        } else {
            System.out.println("num1 等于 num2");

        }

        //    大整数的指数运算
        BigInteger base = new BigInteger("2");
        BigInteger base1 = new BigInteger("2");
        int exponent = 10;
        BigInteger res = base.pow(exponent);
        System.out.println("Result：" + res);

        System.out.println("equals:" + (base.equals(base1)));

    }
}
