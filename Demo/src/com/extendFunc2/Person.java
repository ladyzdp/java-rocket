package com.extendFunc2;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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

    public void keepPet(Animal a, String something) {
        if (a instanceof Dog) {
            Dog d = (Dog) a;
            System.out.println("年龄为" + age + "的" + name + "养了一只" + a.getColor() + "颜色的" + a.getAge() + "的狗");
            d.eat(something);
        } else if (a instanceof Cat) {
            Cat c = (Cat) a;
            System.out.println("年龄为" + age + "的" + name + "养了一只" + a.getColor() + "颜色的" + a.getAge() + "的狗");
            c.eat(something);
        } else {
            System.out.println("这种动物不存在");
        }
    }

}
