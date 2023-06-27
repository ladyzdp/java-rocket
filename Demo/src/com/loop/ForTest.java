package com.loop;

public class ForTest {
    public static void main(String[] args) {
        // 记录一个值的商和余数分别是多少

        int dividend = 100;

        int divisor = 22;

        int count = 0;

        while (dividend >= divisor) {

            dividend = dividend - divisor;
            count++;
        }
        System.out.println("余数为：" + dividend);
        System.out.println("商为：" + count);
    }
}
