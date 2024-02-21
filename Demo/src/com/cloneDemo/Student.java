package com.cloneDemo;

public class Student implements Cloneable {
    private Subject subj;
    private String name;


    public Student() {
    }

    public Student(String subj, String name) {
        this.subj = new Subject(subj);
        this.name = name;
    }

    /**
     * 获取
     *
     * @return subj
     */
    public Subject getSubj() {
        return subj;
    }

    /**
     * 设置
     *
     * @param subj
     */
    public void setSubj(Subject subj) {
        this.subj = subj;
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

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
