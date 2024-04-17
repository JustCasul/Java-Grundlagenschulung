package de.shd.schulung5.adventure;

public class Monster {



    //ATTRIBUTE
    private String name;
    private int gesundheit;
    private int damage;
    private String type;


    //KONSTRUKTOR
    public Monster(String name, int gesundheit, int damage ,String type){
        this.name = name;
        this.gesundheit = gesundheit;
        this.damage = damage;
        this.type = type;
    }


    //METHODEN
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGesundheit() {
        return gesundheit;
    }

    public void setGesundheit(int gesundheit) {
        this.gesundheit = gesundheit;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
