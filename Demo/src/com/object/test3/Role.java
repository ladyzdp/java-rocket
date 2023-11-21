package com.object.test3;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    private char sex;
    private String profile;
    String[] boysTheme = {"高大威猛", "帅气逼人", "勇猛果敢", "潇洒风度", "英武非凡", "笑容可掬", "挺拔俊朗", "举止文雅",
            "身姿矫健", "雄心壮志"};
    String[] girlTheme = {"美丽动人", "温柔娴静", "妩媚多姿", "闭月羞花", "娇媚动人", "婀娜多姿", "粉嫩可人", "仪态万方",
            "容颜绝艳", "优雅妩媚"};
    String[] attacks_desc = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    String[] injureds_desc = {
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%S口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    public Role() {
    }

    public Role(String name, int blood, char sex) {
        this.name = name;
        this.blood = blood;
        this.sex = sex;
        setProfile(sex);
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     *
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    /**
     * 获取
     *
     * @return sex
     */
    public char getSex() {
        return sex;
    }

    /**
     * 设置
     *
     * @param sex
     */
    public void setSex(char sex) {
        this.sex = sex;
    }

    /**
     * 获取
     *
     * @return profile
     */
    public String getProfile() {
        return profile;
    }

    /**
     * 设置
     *
     * @param sex
     */
    public void setProfile(char sex) {
        Random r = new Random();
        if (sex == '男') {
            int index = r.nextInt(boysTheme.length);

            this.profile = boysTheme[index];
        } else if (sex == '女') {
            int index = r.nextInt(girlTheme.length);
            this.profile = girlTheme[index];
        } else {
            this.profile = "面目狰狞";

        }
    }


    /*攻击方法*/
    public void tackle(Role role) {
//        输出一个攻击的效果
        Random a1 = new Random();
        int index = a1.nextInt(attacks_desc.length);
        String kongFu = attacks_desc[index];
        System.out.printf(kongFu, this.getName(), role.getName());
//        随机伤害值
        int harm = a1.nextInt(20) + 1;
//        修改被攻击人血量
        int remainBlood = role.getBlood() - harm;
//        对剩余血量校验，如果为负设置为0
        remainBlood = remainBlood < 0 ? 0 : remainBlood;

        role.setBlood(remainBlood);
        
//        受伤描述
        System.out.println();

        if (remainBlood > 90) {
            System.out.printf(injureds_desc[0], role.getName());
        } else if (remainBlood > 80) {
            System.out.printf(injureds_desc[1], role.getName());

        } else if (remainBlood > 70) {
            System.out.printf(injureds_desc[2], role.getName());

        } else if (remainBlood > 60) {
            System.out.printf(injureds_desc[3], role.getName());

        } else if (remainBlood > 50) {
            System.out.printf(injureds_desc[4], role.getName());

        } else if (remainBlood > 40) {
            System.out.printf(injureds_desc[5], role.getName());

        } else if (remainBlood > 20) {
            System.out.printf(injureds_desc[6], role.getName());

        } else {
            System.out.printf(injureds_desc[7], role.getName());

        }
        System.out.print("，");
    }

    public void showInfo() {
        System.out.println("姓名：" + getName());
        System.out.println("血量：" + getBlood());
        System.out.println("性别：" + getSex());
        System.out.println("外貌：" + getProfile());
    }
}
