package de.shd.Abschlussprojekt;

public class Item {

    //ATTRIBUTE
    private String name; //Name des Items
    private String use; //Nutzen des Items


    //KONSTRUKTOR
    public Item(String name, String use) {
        this.name = name;
        this.use = use;
    }


    //METHODEN
    public String getName() {
        return name;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }
}