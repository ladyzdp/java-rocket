package com.string;

import java.util.Scanner;

public class LoginTest {
    public static void main(String[] args) {
        /*已知正确的用户名和密码，请用程序实现模拟用户登录 总共给三次机会，登录之后给相应的提示*/
        //1.定义两个变量记录用户名和密码

        String userName = "zhangsan";
        String pwd = "1qaz@WSX";

        //2.键盘录入用户名密码
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {

            System.out.println("请输入用户名");
            String rUserName = sc.next();
            System.out.println("请输入密码");
            String rPwd = sc.next();
            int num = 2 - i;
            if (userName.equals(rUserName) && pwd.equals(rPwd)) {
                System.out.println("登录成功！");
                break;
            } else {
                if (i == 2) {
                    System.out.println("账号" + userName + "被锁定，请联系管理类重置密码!");
                } else {
                    System.out.println("用户名或密码错误,您还剩下" + num + "次机会!");

                }
            }
        }

    }
}
