package com.arrayList.arrayTest1;

import java.util.ArrayList;

public class phoneTest {
    public static void main(String[] args) {
        ArrayList<Phone> phoneList = new ArrayList<>();

        Phone p1 = new Phone("小米", 1999);
        Phone p2 = new Phone("苹果", 7999);
        Phone p3 = new Phone("锤子", 2999);
        phoneList.add(p1);
        phoneList.add(p2);
        phoneList.add(p3);

        ArrayList<Phone> findList = findTarget(phoneList);

        for (int i = 0; i < findList.size(); i++) {
            Phone item = findList.get(i);
            System.out.println(item.getBrand() + ", " + item.getPrice());
        }
    }

    private static ArrayList<Phone> findTarget(ArrayList<Phone> list) {
        ArrayList<Phone> filterList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone item = list.get(i);
            int price = item.getPrice();
            if (price < 3000) {
                filterList.add(item);
            }

        }
        return filterList;
    }
}
