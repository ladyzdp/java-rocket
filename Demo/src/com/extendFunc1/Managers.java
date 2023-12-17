package com.extendFunc1;

public class Managers extends Employees {

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    private double bonus;

    public Managers() {
    }

    public Managers(String id, String name, double wages, double bonus) {
        super(id, name, wages);
        this.bonus = bonus;
    }


    public void work() {
        System.out.println("经理在工作");
    }

}
