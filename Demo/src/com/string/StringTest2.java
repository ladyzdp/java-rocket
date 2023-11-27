package com.string;

public class StringTest2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        String res = parseArr(arr);
        System.out.println(res);
        String rev = reverser("abcd");
        System.out.println(rev);
    }

    //    拼接字符串
    public static String parseArr(int[] arr) {
        if (arr == null) {
            return "";
        }
        if (arr.length == 0) {
            return "[]";
        }
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            int chat = arr[i];
            if (i == arr.length - 1) {
                result += chat;
            } else {
                result += chat + ",";

            }
        }
        result += "]";

        return result;
    }

    // 反转字符串
    public static String reverser(String str) {
        String result = "";
        if (str != "") {
            for (int i = str.length() - 1; i >= 0; i--) {
                char c = str.charAt(i);
                result = result + c;
            }
            return result;
        } else {
            return "";
        }

    }

}
