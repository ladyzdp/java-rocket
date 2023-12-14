package com.extendFunc;

public class AnimalTest {
    public static void main(String[] args) {
        Husky hsq = new Husky();
        hsq.eat();
        hsq.drink();
        hsq.rock();
        hsq.destructive();
        System.out.println("-------------------------");

        Teddy td = new Teddy();
        td.eat();
        td.drink();
        td.rock();
        td.rubbing();
        System.out.println("-------------------------");
        PersianCat ps = new PersianCat();
        ps.eat();
        ps.drink();
        ps.touch();
        ps.cold();
        System.out.println("-------------------------");

        RagdollCat ra = new RagdollCat();
        ra.eat();
        ra.drink();
        ra.touch();
        ra.cute();

    }
}
