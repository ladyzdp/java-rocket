package com.arrayList.arrayTest;

import java.util.ArrayList;

public class arrayListTest2 {
    public static void main(String[] args) {
        ArrayList<Students> list = new ArrayList<Students>();

        Students s1 = new Students("001", "dianw", "123456", "典韦", 22);
        Students s2 = new Students("002", "xiangy", "123456", "项羽", 32);
        Students s3 = new Students("003", "xiahd", "123456", "夏侯惇", 33);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        for (int i = 0; i < list.size(); i++) {
            Students item = list.get(i);
            System.out.println(item.getName() + "," + item.getAge());
        }
        int index = checkItem(list, "002");
        Students item = list.get(index);
        System.out.println(item.getId() + "," + item.getUsername() + "," + item.getPwd() + "," + item.getName() + "," + item.getAge());
    }

    public static int checkItem(ArrayList<Students> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Students item = list.get(i);
            String uid = item.getId();
            if (uid.equals(id)) {
                return i;
            }
        }
        return -1;
    }

}
