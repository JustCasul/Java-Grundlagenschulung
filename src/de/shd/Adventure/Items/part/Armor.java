package de.shd.Adventure.Items.part;

import de.shd.Adventure.Items.Item;

public class Armor extends Item {

    //ATTRIBUTE
    private int resistion;


    //KONSTRUKTOR
    public Armor(String name, String type, int resistion, int price) {
        super(name, type, price);
        this.resistion = resistion;
    }


    //METHODEN
    public int getResistion() {
        return resistion;
    }

    public void setResistion(int resistion) {
        this.resistion = resistion;
    }

}
