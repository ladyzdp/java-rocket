package com.array;

import java.util.Random;

public class ArrayTest3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random ran = new Random();
        int total = 0; //求和

        for (int i = 0; i < arr.length; i++) {
            int num = ran.nextInt(100) + 1;
            arr[i] = num;
        }

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
            System.out.print(arr[i] + ",");
        }
        int avg = total / arr.length; //平均数
        int count = 0;//比平均数小的数量
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) {
                count++;
            }
        }

        System.out.println("\n" + "数组中所有数据的和为：" + total);
        System.out.println("数组中的平均数是：" + avg);
        System.out.println("数组中有 " + count + " 个数比平均数小");

    }
}
