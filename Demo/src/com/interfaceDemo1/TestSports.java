package com.interfaceDemo1;

public class TestSports {
    public static void main(String[] args) {
        PingPangCoach pc = new PingPangCoach();
        pc.teach();
        pc.speakEnglish();

        System.out.println("---------------------");
        PingPangSpoter ps = new PingPangSpoter();
        ps.study();
        ps.speakEnglish();
        System.out.println("---------------------");
        BasketBallSpoter bs = new BasketBallSpoter();
        bs.study();
        System.out.println("---------------------");

        BasketBallCoach bc = new BasketBallCoach();
        bc.teach();
    }
}
