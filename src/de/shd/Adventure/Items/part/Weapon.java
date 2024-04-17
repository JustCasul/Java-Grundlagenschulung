package de.shd.Adventure.Items.part;

import de.shd.Adventure.Items.Item;

public class Weapon extends Item {

    //ATTRIBUTE
    private int damage;


    //KONSTRUKTOR
    public Weapon(String name, String type, int damage, int price) {
        super(name, type, price);
        this.damage = damage;
    }


    //METHODEN
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

}
