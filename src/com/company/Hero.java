package com.company;

public class Hero {
    private int health;
    String attackType;
    private int attack;

    public int getHealth() {

        return health;
    }

    public void setHealth(int health) {
        if (this.health <0) {
            System.out.println("Ошибка");
        }else
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        if (this.attack <0) {
            System.out.println("Ошибка");
        }else
        this.attack = attack;
    }

    public Hero (){}

    public Hero ( int Health, String attackType, int Attack) {
        this.health =Health;
        this.attackType=attackType;
        this.attack =Attack;
    }

}
