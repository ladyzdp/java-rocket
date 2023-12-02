package com.studentsSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("---------欢迎来到学生管理系统----------");
            System.out.println("1：登录");
            System.out.println("2：注册");
            System.out.println("3：忘记密码");
            System.out.println("请输入您的选择：");
            String choose = sc.next();
            switch (choose){
                case "1":
                    login();
                    break;
                case "2":
                    register();
                    break;
                case "3":
                    forgetPassword();
                    break;
                default:
                    System.out.println("没有这个选项，请重新输入");
                    break;
            }
        }
    }

    private static void forgetPassword() {
        System.out.println("忘记密码");
    }

    private static void register() {
        System.out.println("注册");
    }

    private static void login() {
        System.out.println("登录");
    }
}
