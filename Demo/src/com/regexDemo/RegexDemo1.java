package com.regexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {
    public static void main(String[] args) {
        String str = "Java的版本演变可以追溯到1996年，当时的版本是Java 1.0。自那时以来，Java进行了许多重大的版本更新和改进。" +
                "其中一些版本是Java 1.1、Java 1.2、Java 1.3、Java 1.4、Java 5、Java 6、Java 7、Java 8、Java 9、Java 10、" +
                "Java 11、Java 12、Java 13、Java 14、Java 15、Java 16以及最新的Java 17";

        Pattern pt = Pattern.compile("Java\\s\\d\\.?\\d"); //生成pattern对象 Pattern类用于编译正则表达式，并生成一个可供重复使用的 Pattern 对象

        Matcher mt = pt.matcher(str); // 匹配字符串  Matcher 类使用 Pattern 对象来执行匹配操作
        System.out.println(mt);
        while (mt.find()) {
            String s = mt.group();
            System.out.println(s);
        }

        Pattern pt1 = Pattern.compile("((?i)Java\\s?(?=\\d\\.?\\d))"); //贪婪爬取

        Matcher mt1 = pt1.matcher(str);

        while (mt1.find()) {
            System.out.println("匹配结果：" + mt1.group());
        }

    }
}
