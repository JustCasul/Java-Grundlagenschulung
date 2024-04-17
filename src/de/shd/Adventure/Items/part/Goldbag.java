package de.shd.Adventure.Items.part;

import de.shd.Adventure.Items.Item;

public class Goldbag extends Item {

    //ATTRIBUTE
    private int gold;


    //KONSTRUKTOR
    public Goldbag(String name, String type, int gold, int price) {
        super(name, type, price);
        this.gold = gold;
    }


    //METHODEN
    public int getGold(){
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
