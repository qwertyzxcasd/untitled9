package com.company;

public class Main {

    public static void main(String[] args) {
        BOSS Boss = new BOSS();
        Boss.setHealth(500);
        Boss.setDamage(50);
        Boss.setSuperType("magic");
        System.out.println(Boss.getHealth() + " " + Boss.getDamage() + " " + Boss.getSuperType());
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getHealth() + " " + createHeroes()[i].getDamage() + " " + createHeroes()[i].getSuperPower());
        }

    }

    public static Hero[] createHeroes() {
        Hero fbytr = new Hero(500, 40, "kenetic");
        Hero vedmak = new Hero(540, 59, "magic");
        Hero elf = new Hero(503, 41, "arrow");
        Hero[] heroes = {fbytr, vedmak, elf};
        return heroes;

    }
}
