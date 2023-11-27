package com.arrayList.arrayTest;

public class Students {
    private String id;
    private String username;
    private String pwd;
    private String name;
    private int age;

    public Students() {
    }


    public Students(String id, String username, String pwd, String name, int age) {
        this.id = id;
        this.username = username;
        this.pwd = pwd;
        this.name = name;
        this.age = age;
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
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     *
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     *
     * @return pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * 设置
     *
     * @param pwd
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }


}
