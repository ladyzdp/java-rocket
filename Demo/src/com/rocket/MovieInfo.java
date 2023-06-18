package com.rocket;

public class MovieInfo {
    public static void main(String[] args) {
        String name = "泰坦尼克号 Titanic";
        int year = 1998;
        String actor = "莱昂纳多·迪卡普里奥 / 凯特·温丝莱特 / 比利·赞恩 / 凯西·贝茨 / 弗兰西丝·费舍";
        double score = 9.5;
        String times = "194分钟 / 227分钟(白星版)";
        System.out.println("电影名称:" + "\t" + name);
        System.out.println("上映日期:" + "\t" + year);
        System.out.println("主演:" + "\t" + actor);
        System.out.println("评分:" + "\t" + score);
        System.out.println("片长:" + "\t" + times);
    }
}