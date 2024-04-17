package de.shd.schulung7;

import java.util.Objects;

public class Item {

    private String name;
    private String type;
    private double weigth;
    private int price;

    public Item (String name, String type, double weigth, int price){
        this.name = name;
        this.type = type;
        this.weigth = weigth;
        this.price = price;
    }


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

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(type, item.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}
