package com.methods;

import java.util.Random;

public class MethodsTest5 {

    public static String generateRandomCode() {
        /*随机生成验证码*/
        Random random = new Random();
        StringBuilder code = new StringBuilder();

        // 生成前四位字母
        for (int i = 0; i < 4; i++) {
            // 生成随机字母（大写或小写）
            char letter = (char) (random.nextInt(26) + 'A');
            if (random.nextBoolean()) {
                letter = Character.toLowerCase(letter);
            }
            code.append(letter);
        }

        // 生成最后一位数字
        int number = random.nextInt(10);
        code.append(number);

        return code.toString();
    }

    public static void main(String[] args) {
        /*定义一个方法随机产生一个5位的验证码 验证码格式：长度为5 前四位是大写字母或小写字母 最后一位是数字*/

        String randomCode = generateRandomCode();
        System.out.println("Random Code: " + randomCode);
    }

}
