package com.array;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = 0;
        int target = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i]);
                target++;

            }
        }
        System.out.println("数组的累加结果是：" + total);
        System.out.println("能被3整除的个数是：" + target + " 个");

    }
}
