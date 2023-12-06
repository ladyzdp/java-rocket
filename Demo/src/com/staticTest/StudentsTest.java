package com.staticTest;

import java.util.ArrayList;

public class StudentsTest {
    public static void main(String[] args) {
        Students.teachName = "静静老师";
        Students s1 = new Students("张三", 23, "男");
        s1.show();
        s1.study();
        Students s2 = new Students("赵四", 33, "男");
        s2.show();
        s2.study();
        Students s3 = new Students("刘能", 67, "男");
        s3.show();
        s3.study();
        int[] arr = {1, 2, 3, 4, 5};
        String str = ArrayUtil.printArr(arr);
        System.out.println(str);

        double[] arr1 = {1.2, 1.3, 3.2, 5.4, 5.6};

        double avg = ArrayUtil.getAvg(arr1);

        System.out.println(avg);

        ArrayList<Students> arr2 = new ArrayList<>();
        arr2.add(s1);
        arr2.add(s2);
        arr2.add(s3);

        int maxAge = StuUtil.getMaxAge(arr2);

        System.out.println("年龄最大的是：" + maxAge);
    }
}
