package com.studentsSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        loop:
        while (true) {
            System.out.println("---------欢迎来到学生管理系统----------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生信息");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("请输入您的选择：");
            Scanner sc = new Scanner(System.in);

            String choose = sc.next();
            switch (choose) {
                case "1":
                    addStudent(list);
                    break;
                case "2":
                    deleteStudent(list);
                    break;
                case "3":
                    updateStudent(list);
                    break;
                case "4":
                    queryStudent(list);
                    break;
                case "5":
                    System.out.println("退出");
                    break loop;
//                    System.exit(0);
                default:
                    System.out.println("没有这个选项");
                    break;
            }
        }
    }

    public static void addStudent(ArrayList<Student> list) {
        // 添加学生
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.println("请添加学生的Id");
            id = sc.next();
            boolean flag = checkId(list, id);
            if (flag) {
                stu.setId(id);
                break;
            } else {
                System.out.println("Id已经存在请重新录入");
            }

        }


        System.out.println("请添加学生的姓名");
        String name = sc.next();
        stu.setName(name);
        System.out.println("请添加学生的年龄");
        int age = sc.nextInt();
        stu.setAge(age);
        System.out.println("请添加学生的家庭住址");
        String address = sc.next();
        stu.setAddress(address);
        list.add(stu);

        System.out.println("学生信息添加成功！");

    }

    public static void deleteStudent(ArrayList<Student> list) {
        System.out.println("请输入要删除的学生Id");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int index = getIndex(list, id);
        if (index >= 0) {
            list.remove(index);
            System.out.println("删除学生成功");

        } else {
            System.out.println("学生不存在");
        }

    }

    public static void updateStudent(ArrayList<Student> list) {
        // 修改学生
        System.out.println("请输入要修改的学生Id");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int index = getIndex(list, id);

        System.out.println("index=====" + index);
        if (index >= 0) {
            Student stu = list.get(index);
            System.out.println("请输输入学生新姓名");
            String newName = sc.next();
            stu.setName(newName);
            System.out.println("请输输入学生新年龄");
            int newAge = sc.nextInt();
            stu.setAge(newAge);
            System.out.println("请输输入学生新地址");
            String newAddress = sc.next();
            stu.setAddress(newAddress);

        } else {
            System.out.println("没有查询到学生信息");
        }
    }

    public static void queryStudent(ArrayList<Student> list) {
        // 查询学生
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }
        System.out.println("Id\t\t姓名\t\t年龄\t\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);

            System.out.println(stu.getId() + "\t\t" + stu.getName() + "\t\t" + stu.getAge() + "\t\t" + stu.getAddress());
        }

    }

    public static boolean checkId(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getId().equals(id)) {
                return false;
            }
        }
        return true;
    }

    public static int getIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
