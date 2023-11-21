package com.object.test4;

public class GoodTest {
    public static void main(String[] args) {
        Goods[] arr = new Goods[3];

        Goods g1 = new Goods("001", "小米手机", 1999, 1000);
        Goods g2 = new Goods("002", "南孚电池", 5, 99);
        Goods g3 = new Goods("003", "电饼铛", 299, 100);

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println(goods.getId() + "," + goods.getName() + "," + goods.getPrice() + "," + goods.getCount());
        }
    }
}
