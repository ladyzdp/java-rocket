package com.string;

public class StringTest4 {
    public static void main(String[] args) {
//        手机号脱敏
        String phone = "18638281552";
        String result = replacePhone(phone);
        System.out.println(result);
//        根据身份证号，获取出生年月日和性别
        String idCard = "411503199003261711";
        porintIdCard(idCard);
        String talk = "游戏玩的真好，下次别TMD这么玩了，CNMD";

        String talkResult = replaceWord(talk);
        System.out.println(talkResult);
    }

    //    手机号脱敏
    public static String replacePhone(String phone) {
        if (phone != "") {
            String start = phone.substring(0, 3);
            String end = phone.substring(7);
            return start + "****" + end;
        } else {
            return "";
        }
    }

    //    根据身份证号输出出生年月，性别
    public static void porintIdCard(String idCard) {
        if (idCard.length() == 18) {
            String year = idCard.substring(6, 10);
            String month = idCard.substring(10, 12);
            String day = idCard.substring(12, 14);
            int gender = Integer.parseInt(idCard.substring(16, 17)); //性别
            String genderStr = gender % 2 == 0 ? "女" : "男";

            System.out.println("人物信息：");
            System.out.println("出生年月日：" + year + "年" + month + "月" + day + "日");
            System.out.println("性别：" + genderStr);
        } else {
            System.out.println("请输入正确的身份证号！");
        }
    }
    //敏感词替换

    public static String replaceWord(String word) {
        String[] arr = {"CNM", "TMD", "SB", "CNMD"};
        for (int i = 0; i < arr.length; i++) {
            word = word.replace(arr[i], "***");
        }
        return word;
    }
}
