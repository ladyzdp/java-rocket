package com.dateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {
    public static void main(String[] args) throws ParseException {

        //     定义字符串表示三个时间节点
        String startStr = "2024年02月25日 0:0:0";
        String endStr = "2024年02月25日 0:10:0";
        String orderStr = "2024年02月25日 0:01:00";

        //    解析上面时间获取时间对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDate = sdf.parse(startStr);
        Date endDate = sdf.parse(endStr);
        Date orderDate = sdf.parse(orderStr);
        //    得到时间毫秒值
        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        long orderTime = orderDate.getTime();

        if (orderTime >= startTime && orderTime <= endTime) {
            System.out.println("参加秒杀活动成功");
        } else {
            System.out.println("参加秒杀活动失败");
        }

    }
}
