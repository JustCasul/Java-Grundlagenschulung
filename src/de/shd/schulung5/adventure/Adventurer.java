package de.shd.schulung5.adventure;

public class Adventurer {

    //ATTRIBUTE
    private String name;
    private int gesundheit;
    private Weapon weapon;
    private String type;


    //KONSTRUKTOR
    public Adventurer(String name, int gesundheit, Weapon weapon, String type) {
        this.name = name;
        this.gesundheit = gesundheit;
        this.weapon = weapon;
        this.type = type;
    }


    //METHODEN
    public int getGesundheit() {
        return gesundheit;
    }

    public void setGesundheit(int gesundheit) {
        this.gesundheit = gesundheit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
