package com.runtimeDemo;

import java.io.IOException;

public class RuntimeTest {
    public static void main(String[] args) throws IOException {
        Runtime r = Runtime.getRuntime();

        System.out.println("---------getRuntime----------");
        System.out.println(r);
        System.out.println("可用的处理器数量: " + r.availableProcessors());
        System.out.println("系统总内存量: " + (r.maxMemory() / 1024 / 1024) + " MB");
        System.out.println("Java虚拟机的总内存量: " + (r.totalMemory() / 1024 / 1024) + " MB");
        System.out.println("Java虚拟机的空闲内存量: " + (r.freeMemory() / 1024 / 1024) + " MB");
        r.exec("node -v");
        r.exit(0);
    }
}
