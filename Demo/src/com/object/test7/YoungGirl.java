package com.object.test7;

public class YoungGirl {
    private String name;
    private int age;
    private String job;
    private String hobby;

    public YoungGirl() {
    }
 
    public YoungGirl(String name, int age, String job, String hobby) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.hobby = hobby;
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
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return job
     */
    public String getJob() {
        return job;
    }

    /**
     * 设置
     *
     * @param job
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     * 获取
     *
     * @return hobby
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * 设置
     *
     * @param hobby
     */
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

}
