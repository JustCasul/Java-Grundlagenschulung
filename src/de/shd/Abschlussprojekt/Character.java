package de.shd.Abschlussprojekt;

public class Character {

    //ATTRIBUTE
    private final String name; //Name des Characters
    private int lifepoints; //Lebenspunkte
    private Weapon weapon; //Waffe
    private Item item; //Items


    //KONSTRUKTOR
    public Character(String name, int lifepoints, Weapon weapon, Item item) {
        this.name = name;
        this.lifepoints = lifepoints;
        this.weapon = weapon;
        this.item = item;
    }


    //METHODEN
    public String getName() {
        return name;
    }

    public int getLifepoints() {
        return lifepoints;
    }

    public void setLifepoints(int lifepoints) {
        this.lifepoints = lifepoints;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
