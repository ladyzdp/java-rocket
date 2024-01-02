package com.interfaceDemo;

public class JobTest {
    public static void main(String[] args) {
        Front f = new Front("前端开发", 9999);
        f.work();
        f.methods();
        System.out.println("----------------");
        Backend b = new Backend("后端开发", 9999);
        b.work();
        b.methods();
    }
}
