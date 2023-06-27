package com.array;

public class ArrayTest2 {
    public static void main(String[] args) {
        int[] arr = {33, 45, 66, 23, 54};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("最大值是：" + max);
    }
}
