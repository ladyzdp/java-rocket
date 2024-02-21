package com.cloneDemo;

public class ObjectDemo1 {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8};
        Student stud = new Student("三三", "张张");

        System.out.println("原始对象：" + stud.getName() + "--" + stud.getSubj().getName());

        //拷贝对象

        Student cloneStud = (Student) stud.clone();
        System.out.println("拷贝对象:" + cloneStud.getName() + "--" + cloneStud.getSubj().getName());
        System.out.println("原对象和拷贝对象是否一致：" + (stud == cloneStud));
        System.out.println("原对象和拷贝对象name属性：" + (stud.getName() == cloneStud.getName()));
        System.out.println("原对象和拷贝对象subj属性：" + (stud.getSubj() == cloneStud.getSubj()));

        stud.setName("刘流");
        stud.getSubj().setName("流星");
        System.out.println("更新后的原对象和拷贝对象name属性是否一致：" + stud.getName() + "--" + cloneStud.getSubj().getName());
        System.out.println("更新后的原对象和拷贝对象subj属性是否一致：" + stud.getName() + "--" + cloneStud.getSubj().getName());
    }
}
