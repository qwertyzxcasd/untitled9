package com.company;

public class BOSS {
    private int health;
    private int damage;
    private String superType;

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setSuperType(String superType) {
        this.superType = superType;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperType() {
        return superType;
    }
}
