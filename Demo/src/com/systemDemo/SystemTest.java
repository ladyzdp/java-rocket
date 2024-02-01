package com.systemDemo;

import java.util.Arrays;

public class SystemTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("操作执行时间：" + elapsedTime + " ms");


        System.out.println("-------手动触发垃圾回收----------");
        System.gc();

        System.out.println("-------getProperty(String key): 获取指定系统属性的值----------");
        String os = System.getProperty("os.name");
        System.out.println("操作系统：" + os);

        System.out.println("-------getenv(String name): 获取指定环境变量的值----------");

        String userName = System.getenv("USERNAME");
        System.out.println("当前用户名：" + userName);

        System.out.println("-------arraycopy(Object src, int srcPos, Object dest, int destPos, int length): 将一个数组的指定部分复制到另一个数组中----------");

        int[] source = {1, 2, 3, 4, 5};
        int[] destination = new int[5];
        System.arraycopy(source, 0, destination, 0, source.length);
        System.out.println(Arrays.toString(destination));
        System.exit(1);
    }
}
