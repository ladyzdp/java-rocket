package com.dateDemo;

import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class DateDemo3 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        Date d = new Date();
        c.setTime(d);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DATE);
        c.add(Calendar.YEAR, 1);

        System.out.println("当前日期：" + year + "年" + month + 1 + "月" + date + "日");

        Set<String> ZondIds = ZoneId.getAvailableZoneIds();
        ZoneId zongid = ZoneId.systemDefault();
        System.out.println("时区的数量是：" + ZondIds.size());
        System.out.println("时区的列表：" + ZondIds);
        System.out.println("当前默认时区 ：" + zongid);

        ZoneId zongid1 = ZoneId.of("Africa/Cairo");

        System.out.println("设置后的时区：" + zongid1);
    }

}
