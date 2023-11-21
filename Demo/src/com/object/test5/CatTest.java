package com.object.test5;

import java.util.Scanner;

public class CatTest {
    public static void main(String[] args) {
        Car[] arr = new Car[3];

        // 创建汽车对象，数据来自键盘录入

        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < arr.length; i++) {
            Car car = new Car();
            System.out.println("请输入汽车品牌");
            String brand = sc.next();
            car.setBrand(brand);
            System.out.println("请输入汽车价格");
            int price = sc.nextInt();
            car.setPrice(price);
            System.out.println("请输入汽车颜色");
            String color = sc.next();
            car.setColor(color);

            arr[i] = car;
        }

        for (int i = 0; i < arr.length; i++) {
            Car item = arr[i];
            System.out.println(item.getBrand() + "," + item.getPrice() + "," + item.getColor());
        }
    }
}
