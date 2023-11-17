package com.methods;

public class MethodsTest3 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        printString(arr);

        int max = maxNumber(arr);
        int[] copyArr = copyArray(arr, 2, 5);
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }
        System.out.println("数组最大值为：" + max);
    }


    //    打印字符串
    public static void printString(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }

    //    求数组最大值
    public static int maxNumber(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //    拷贝数组
    public static int[] copyArray(int[] arr, int form, int to) {
        int[] newArr = new int[to - form];
        int index = 0;
        for (int i = form; i < arr.length; i++) {
            newArr[index] = arr[i];
        }
        return newArr;
    }
}
