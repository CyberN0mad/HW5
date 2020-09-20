package com.company;

public class Boss {
    private int bossHealth;
    private int bossDamage;
    private String Defence;

    public Boss(int health, int bossDamage, String Defence) {
        this.bossHealth = health;
        this.bossDamage = bossDamage;
        this.Defence = Defence;
    }
    public int getBossHealth() {
        return bossHealth;
    }
    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }
    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public String getDefence() {
        return Defence;
    }

    public void setDefence(String defence) {
        this.Defence = defence;
    }
}