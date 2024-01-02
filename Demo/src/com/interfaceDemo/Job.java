package com.interfaceDemo;

public class Job {
    private String name;
    private double money;

    public Job() {
    }

    public Job(String name, double money) {
        this.name = name;
        this.money = money;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return money
     */
    public double getMoney() {
        return money;
    }

    /**
     * 设置
     *
     * @param money
     */
    public void setMoney(double money) {
        this.money = money;
    }

    public void work() {
        System.out.println("打螺丝");
    }
}
