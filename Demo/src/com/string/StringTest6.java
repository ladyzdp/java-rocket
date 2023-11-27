package com.string;

import java.util.StringJoiner;

public class StringTest6 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",", "[", "]");
        sj.add("a").add("b").add("c");
        int len = sj.length();
        String result = sj.toString();
        System.out.println(len);
        System.out.println(result);

    }
}
