package de.shd.Abschlussprojekt;

public class Weapon {

    //ATTRIBUTE
    private final String name; //Name der Waffe
    private int ammunition; //Munition


    //KONSTRUKTOR
    public Weapon(String name, int ammunition) {
        this.name = name;
        this.ammunition = ammunition;
    }


    //METHODEN
    public String getName() {
        return name;
    }

    public int getAmmunition() {
        return ammunition;
    }

    public void setAmmunition(int ammunition) {
        this.ammunition = ammunition;
    }

}
