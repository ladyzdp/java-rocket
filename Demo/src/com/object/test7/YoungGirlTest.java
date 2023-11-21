package com.object.test7;

public class YoungGirlTest {
    //计算4位女英雄的平均年龄，并把小于平均年龄的英雄打印出来 统计个数；

    public static void main(String[] args) {
        YoungGirl[] arr = new YoungGirl[4];

        YoungGirl yg1 = new YoungGirl("蔡文姬", 23, "辅助", "加血");
        YoungGirl yg2 = new YoungGirl("妲己", 18, "攻击法师", "晕眩");
        YoungGirl yg3 = new YoungGirl("貂蝉", 16, "近战法师", "禁锢");
        YoungGirl yg4 = new YoungGirl("芈月", 23, "控制型法师", "魔法伤害");

        arr[0] = yg1;
        arr[1] = yg2;
        arr[2] = yg3;
        arr[3] = yg4;

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            YoungGirl item = arr[i];
            sum = sum + item.getAge();
        }
        int avg = sum / arr.length;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            YoungGirl item = arr[i];
            if (item.getAge() < avg) {
                count++;
                System.out.println(item.getName() + "，" + item.getAge() + "，" + item.getJob() + "，" + item.getHobby());
            }
        }
        System.out.println(arr.length + "位法师的平均年龄是：" + avg + "岁，" + "小于平均年龄的有" + count + "位");
    }

}
