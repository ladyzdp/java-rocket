package com.extendFunc1;

public class Chef extends Employees {
    {

        System.out.println("构造代码块测试");
    }

    public Chef() {

    }

    public Chef(String id, String name, double wages) {
        super(id, name, wages);
    }

    public void work() {
        System.out.println("厨师在炒菜");
    }

}
