package com.company;

import java.util.Random;

public class Boss {
    private int health;
    String attackType;
    private int attack;

    public void ChangeAttackType() {
        System.out.println("Kinetic");


    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            System.out.println("Ошибка");
        } else
            this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        if (attack < 0) {
            System.out.println("Ошибка");
        } else
            this.attack = attack;
    }
}
