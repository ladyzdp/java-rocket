package com.extendFunc2;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("赵四", 33);
        Dog d = new Dog(2, "黑");
        p.keepPet(d, "骨头");

        Person p1 = new Person("谢广坤", 45);
        Cat c = new Cat(3, "花");
        p1.keepPet(c, "鱼干");
    }
}
