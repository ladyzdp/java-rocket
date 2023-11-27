package com.arrayList;

import java.util.ArrayList;

public class arrayListTest1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        //添加元素
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        //修改
        list.set(3, "ee");
        //查询
        String item = list.get(1);
        System.out.println("item===" + item);
        System.out.println(list);
        //删除
        list.remove(0);
        System.out.println("remove before" + list);

    }
}
