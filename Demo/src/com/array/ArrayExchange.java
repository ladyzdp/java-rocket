package com.array;

import java.util.Random;

public class ArrayExchange {
    public static void main(String[] args) {
//        交换变量中的值
        int[] arr = {1, 2, 3, 4, 5};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int inx = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[inx];
            arr[inx] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("索引=====" + arr[i]);

        }
    }
}
