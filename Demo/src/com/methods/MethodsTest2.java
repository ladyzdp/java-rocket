package com.methods;

/**
 * @author huangzz
 */
public class MethodsTest2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("结果是：" + total(arr));

    }

    public static int total(int[] arr) {
        int total = 0;
        if (arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                total += arr[i];
            }
        }
        return total;
    }
}
