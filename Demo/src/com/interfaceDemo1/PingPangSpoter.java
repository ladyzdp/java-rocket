package com.interfaceDemo1;

public class PingPangSpoter extends Sporter implements English {
    public PingPangSpoter() {
    }

    public PingPangSpoter(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员在说英语");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员在练习打乒乓球");
    }


}
