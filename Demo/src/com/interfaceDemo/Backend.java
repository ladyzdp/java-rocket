package com.interfaceDemo;

public class Backend extends Job implements Tools {
    public Backend() {
    }

    public Backend(String name, double money) {
        super(name, money);
    }

    @Override
    public void work() {
        System.out.println("写服务的");
    }

    @Override
    public void methods() {
        System.out.println("使用idea开发");
    }

}
