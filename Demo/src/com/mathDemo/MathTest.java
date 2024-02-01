package com.mathDemo;

public class MathTest {
    public static void main(String[] args) {
        System.out.println("-----------abs反回绝对值-------------");
        System.out.println(Math.abs(12.23)); //12.23
        System.out.println(Math.abs(-12.23)); //12.23

        System.out.println("-----------ceil(x): 返回大于或等于给定数的最小整数-------------");
        System.out.println(Math.ceil(3.141592)); //4.0
        System.out.println(Math.ceil(2.0)); //2.0

        System.out.println("-----------min(x, y): 返回两个数中的最小值-------------");
        System.out.println(Math.min(100, 10)); //10

        System.out.println("-----------max(x, y): 返回两个数中的最大值-------------");
        System.out.println(Math.max(100, 10)); //100

        System.out.println("-----------floor(x): 返回小于或等于给定数的最大整数-------------");
        System.out.println(Math.floor(3.141592)); //3.0
        System.out.println(Math.floor(1.0907)); //1.0

        System.out.println("-----------round(x): 返回给定数的四舍五入值-------------");
        System.out.println(Math.round(3.141592653)); //3
        System.out.println(Math.round(3.54)); //4

        System.out.println("-----------sqrt(x): 返回给定数的平方根-------------");
        System.out.println(Math.sqrt(4)); //2.0
        System.out.println(Math.sqrt(9)); //3.0

        System.out.println("-----------pow(x, y): 返回x的y次幂-------------");
        System.out.println(Math.pow(3, 5)); //243.0
        System.out.println(Math.pow(2, 10)); //1024.0

        System.out.println("-----------exp(x): 返回给定数的自然指数（e的x次幂）-------------");
        System.out.println(Math.exp(100)); //2.6881171418161356E43
        System.out.println(Math.exp(200)); //7.225973768125749E86

        System.out.println("-----------log(x): 返回给定数的自然对数-------------");
        System.out.println(Math.log(100)); //4.605170185988092
        System.out.println(Math.log(200)); //5.298317366548036

        System.out.println("-----------log10(x): 返回给定数的以10为底的对数-------------");
        System.out.println(Math.log10(100)); //2.0
        System.out.println(Math.log10(200)); //5.298317366548036

        System.out.println("-----------random(): 返回一个大于等于0且小于1的随机数-------------");
        System.out.println(Math.random()); //0.5078710998746548

        System.out.println("-----------sin(x): 返回给定角度的正弦值-------------");
        System.out.println(Math.sin(360)); //0.9589157234143065

        System.out.println("-----------cos(x): 返回给定角度的余弦值-------------");
        System.out.println(Math.cos(360)); //-0.2836910914865273

        System.out.println("-----------tan(x): 返回给定角度的正切值-------------");
        System.out.println(Math.tan(360)); //-3.380140413960958

        System.out.println("-----------Math.PI: 圆周率π的近似值-------------");
        System.out.println(Math.PI); //3.141592653589793

        System.out.println("-----------Math.E: 自然常数e的近似值-------------");
        System.out.println(Math.E); //2.718281828459045


    }
}
