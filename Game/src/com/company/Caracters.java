package com.company;

public class Caracters {
    public int health;
    public String name;
    public int minpower;
    public int maxpower;

    public Caracters(int health, int minpower, int maxpower,String name) {
        this.health = health;
        this.name = name;
        this.maxpower = maxpower;
        this.minpower = minpower;
    }

    public boolean isDead() {
        if (this.health <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public int attack(Caracters other) {
        int att = minpower + (int) (Math.random() * maxpower);
        return att;
    }

    public int attacked(Caracters other, int att) {
        this.health = this.health - att;
        return health;
    }

    public int getHealth() {
        return health;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public boolean checkHealth(Caracters other) {

        if (this.health <= 0) {
            return false;
        }else {
            return true;
        }
    }
}


