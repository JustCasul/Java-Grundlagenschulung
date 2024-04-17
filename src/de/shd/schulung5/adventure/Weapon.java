package de.shd.schulung5.adventure;

public class Weapon {

    //ATTRIBUTE
    private String name;
    private int damage;


    //KONSTRUKTOR
    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }


    //METHODEN
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

}
