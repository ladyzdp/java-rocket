package com.interfaceDemo;

public class Front extends Job implements Tools {
    public Front() {
    }

    public Front(String name, double money) {
        super(name, money);
    }

    @Override
    public void work() {
        System.out.println("写页面的");
    }

    @Override
    public void methods() {
        System.out.println("使用vsCode开发");
    }

}
