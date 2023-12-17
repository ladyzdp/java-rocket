package com.extendFunc1;

public class JobTest {
    public static void main(String[] args) {
        Managers m = new Managers("001", "赵四", 20000, 30000);
        System.out.println(m.getId() + "," + m.getName() + "," + m.getWages() + "," + m.getBonus());
        m.work();
        m.eat();

        Chef c = new Chef("002", "谢大脚", 18000);
        System.out.println(c.getId() + "," + c.getName() + "," + c.getWages());
        c.work();
        c.eat();
    }
}
