package com.dateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) throws ParseException {
        Date dt = new Date();

        Date dtStart = new Date(0L);
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        String formatDtStart = fmt.format(dtStart);
        String formatDt = fmt.format(dt);
        System.out.println("当前系统时间：" + dt);
        System.out.println("当前系统时间格式化：" + formatDt);
        System.out.println("当前时间毫秒：" + dt.getTime());
        System.out.println("格林威治时间：" + dtStart);
        System.out.println("格林威治时间格式化：" + formatDtStart);


        System.out.println("--------------------------------");
        //定义时间
        String str = "2017-05-01";
        SimpleDateFormat smpf = new SimpleDateFormat("yy-MM-dd");
        //解析时间
        Date date1 = smpf.parse(str);
  
        SimpleDateFormat smpf1 = new SimpleDateFormat("yyyy年MM月dd日");
        String result = smpf1.format(date1);
        System.out.println(date1);
        System.out.println("格式化时间：" + result);
    }
}
