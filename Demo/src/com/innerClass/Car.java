package com.innerClass;

public class Car {
    public String name;
    public String color;
    public int price;

    public Car() {
    }

    public Car(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public void show() {
        System.out.println("汽车的名称是：" + name + " 颜色：" + color + " 价格：" + price);

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
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取
     *
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * 设置
     *
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }


    public static class Motor {
        public String model;
        public int power;

        public Motor() {
        }

        public Motor(String model, int power) {
            this.model = model;
            this.power = power;
        }

        public void show() {
            System.out.println("发动机的型号：" + model + " 发动机马力：" + power);
        }

        /**
         * 获取
         *
         * @return model
         */
        public String getModel() {
            return model;
        }

        /**
         * 设置
         *
         * @param model
         */
        public void setModel(String model) {
            this.model = model;
        }

        /**
         * 获取
         *
         * @return power
         */
        public int getPower() {
            return power;
        }

        /**
         * 设置
         *
         * @param power
         */
        public void setPower(int power) {
            this.power = power;
        }

    }
}
