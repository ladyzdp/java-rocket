package com.regexDemo;

public class RegexDemo {
    public static void main(String[] args) {
        //    初始案例
        String input = "123456";

        boolean isMatch = input.matches("\\d+");
        boolean isMore = input.matches(".+");
        System.out.println("数字贪婪模式:" + isMatch);
        System.out.println("贪婪模式:" + isMore);

        //    匹配手机号练习 18638281556

        String rex = "1[3-8]\\d{9}";

        String phone1 = "18638281552";
        String phone2 = "13188888823";
        String phone3 = "15389392343";
        System.out.println("规则：1[3-8]\\d{9}");
        System.out.println("手机号匹配： " + phone1 + phone1.matches(rex));
        System.out.println("手机号匹配： " + phone1 + phone2.matches(rex));
        System.out.println("手机号匹配： " + phone1 + phone3.matches(rex));

        //    座机号码  0766-39716223  0754-44045268 0955-89353968 0902-77046776 0772-23698573


        String num1 = "0766-39716223";
        String num2 = "0754-44045268";
        String num3 = "0955-89353968";
        String num4 = "0772-23698573";

        String rexNum = "0[1-9]{3}-?\\d{8}";

        System.out.println(num1 + " 匹配结果：" + num1.matches(rexNum));
        System.out.println(num2 + " 匹配结果：" + num2.matches(rexNum));
        System.out.println(num3 + " 匹配结果：" + num3.matches(rexNum));
        System.out.println(num4 + " 匹配结果：" + num4.matches(rexNum));
        //    邮箱号码  hpuvcdnhw@gmail.com
        //hzcnnng@foxmail.com
        //vrksfiimu@qq.com
        //qigvuje@163.com
        //jutozf@126.com
        //coojwtubl@yahoo.com
        //owtscrpvy@gmail.com
        //cxzdm@foxmail.com
        String mail1 = "hzcnnng@foxmail.com";
        String mail2 = "vrksfiimu@qq.com";
        String mail3 = "qigvuje@163.com";
        String mail4 = "owtscrpvy@gmail.com";
        String mail5 = "mytag@pci.com.cn";

        String rexMail = "\\w+@[\\w&&[^_]]{2,8}(\\.[a-zA-Z]{2,3}){1,2}";

        System.out.println(mail1 + " 匹配结果：" + mail1.matches(rexMail));
        System.out.println(mail2 + " 匹配结果：" + mail2.matches(rexMail));
        System.out.println(mail3 + " 匹配结果：" + mail3.matches(rexMail));
        System.out.println(mail4 + " 匹配结果：" + mail4.matches(rexMail));
        System.out.println(mail5 + " 匹配结果：" + mail5.matches(rexMail));

        //  身份证号
        //    330212202201177215
        //    632624199312215734
        //    310104199406027911
        //    42060219600922415X
        String idCard1 = "330212202201177215";
        String idCard2 = "632624199312215734";
        String idCard3 = "310104199406027911";
        String idCard4 = "42060219600922415X";

        String rexIdCard = "[1-9]\\d{5}[1-2]\\d{3}(0[0-9]|1[0-2])(0[1-9]|[12]\\d|3[01])\\d{3}[\\dXx]";

        System.out.println(idCard1 + " 匹配结果：" + idCard1.matches(rexIdCard));
        System.out.println(idCard2 + " 匹配结果：" + idCard2.matches(rexIdCard));
        System.out.println(idCard3 + " 匹配结果：" + idCard3.matches(rexIdCard));
        System.out.println(idCard4 + " 匹配结果：" + idCard4.matches(rexIdCard));

    }
}
