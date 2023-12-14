package com.extendFunc;

public class Husky extends Dog {
    public void destructive() {
        System.out.println("哈士奇擅长拆家？");
    }


    @Override
    public void eat() {
        System.out.println("哈士奇喜欢吃骨头");
    }

}
