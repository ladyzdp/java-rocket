package com.object.test6;

public class PhoneAvgTest {
    public static void main(String[] args) {
        PhoneAvg[] arr = new PhoneAvg[3];

        PhoneAvg p1 = new PhoneAvg("小米", 1999, "白色");
        PhoneAvg p2 = new PhoneAvg("魅族", 1899, "白色");
        PhoneAvg p3 = new PhoneAvg("一加", 2999, "白色");

        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            PhoneAvg item = arr[i];
            //计算总价
            sum = sum + item.getPrice();
        }

        //int avg = sum / arr.length;
        double avg = sum * 1.0 / arr.length;
        System.out.println(arr.length + "部手机的平均价格是：" + avg + "元");
    }
}
