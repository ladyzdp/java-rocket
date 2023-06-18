package com.rocket;
// 隐式转换
// 数据类型不一样，不能计算，需要转换城一样的才可以进行计算。

// 取之范围小的和取值范围大的进行运算，小的会先提升为大的，再进行运算

// byte short chart 三种类型的数据在运算的时候，都会先提升为int类型，再进行运算
public class OperatorsConvert {
    public static void main(String[] args) {
        // 隐士转换
        byte b1 = 10;
        byte b2 = 20;
        short b3 = 30;
        System.out.println("隐式转换:" + (b1 + b2 + b3));

        int a1 = 10;
        long a2 = 100L;
        double a3 = 20.0;
        System.out.println("隐式转换:" + (a1 + a2 + a3));
        // 强制转换
        byte c1 = 20;
        byte c2 = 20;
        //        int result = c1 + c2;
        byte result = (byte) (c1 + c2);
        System.out.println("强制转换:" + result);
        // 自增
        c1++;
        c2--;
        System.out.println("c1自增：" + c1);
        System.out.println("c2自减：" + c2);
        //赋值运算符
        System.out.println("-------赋值运算符------");

    }
}
