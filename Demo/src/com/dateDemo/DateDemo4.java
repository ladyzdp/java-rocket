package com.dateDemo;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateDemo4 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("当前日期是：" + currentDate);
        LocalTime currentTime = LocalTime.now();
        System.out.println("当前时间是：" + currentTime);

    }
}
