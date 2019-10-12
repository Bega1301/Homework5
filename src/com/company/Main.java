package com.company;

public class Main {

    public static void main(String[] args) {
        Hero h1 = new Hero();
        h1.setHealth(250);
        h1.attackType = "Phisical";
        h1.setAttack(30);

        Boss b1 = new Boss();
        b1.setAttack(50);
        b1.setHealth(1000);
        b1.attackType = "Magic";
        System.out.println("Boss: " + b1.getHealth() + " " + b1.attackType + " " + b1.getAttack() + " ");
        b1.ChangeAttackType();
        System.out.println(h1.getHealth() + " " + h1.attackType + " " + h1.getAttack() + " ");


        Hero h2 = new Hero(200, "Kinetic", 15);
        Hero h3 = new Hero(150, "Magical", 10);
        Hero h4 = new Hero(100, "Medical", 0);




        System.out.println(h2.getHealth() + " " + h2.attackType + " " + h2.getAttack() + " ");
        System.out.println(h3.getHealth() + " " + h3.attackType + " " + h3.getAttack() + " ");
        System.out.println(h4.getHealth() + " " + h4.attackType + " " + h4.getAttack() + " ");


    }
}
