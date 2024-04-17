package de.shd.Adventure.Items;

public class Item {

    //ATTRIBUTE
    private String name;
    private String type;
    private int price;


    //KONSTRUKTOR
    public Item(String name, String type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }


    //METHODEN
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
