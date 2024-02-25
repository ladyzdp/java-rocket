package com.bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        double nm1 = 1.22;
        double nm2 = 2.35;
        System.out.println(nm1 + nm2);
        System.out.println(nm1 - nm2);
        System.out.println(nm1 * nm2);
        System.out.println(nm1 / nm2);


        String nm3 = "1.22";
        String nm4 = "2.33";
        BigDecimal num1 = new BigDecimal(nm3);
        BigDecimal num2 = new BigDecimal(nm4);
        //加法
        BigDecimal sum = num1.add(num2);
        //💇减法
        BigDecimal subtract = num1.subtract(num2);
        //乘法
        BigDecimal multiply = num1.multiply(num2);
        //除法
        BigDecimal divide = num1.divide(num2, 2, RoundingMode.HALF_UP);

        System.out.println("Add:" + sum);
        System.out.println("Subtract:" + subtract);
        System.out.println("Multiply:" + multiply);
        System.out.println("Divide:" + divide);
        System.out.println("IntValue:" + sum.intValue());
        System.out.println("LongValue:" + sum.longValue());
        System.out.println("ToString:" + sum.toString());


    }
}
