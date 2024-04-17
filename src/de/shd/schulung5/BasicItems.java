package de.shd.schulung5;

public class BasicItems {

    //ATTRIBUTE
    private String name;
    private int damage;
    private int ability_power;
    private int attack_speed;
    private int price;



    //KONSTRUKTOR
    public BasicItems(String name, int damage, int ability_power, int attackSpeed, int price) {
        this.name = name;
        this.damage = damage;
        this.ability_power = ability_power;
        this.attack_speed = attackSpeed;
        this.price = price;
    }


    //METHODEN
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getAbility_power() {
        return ability_power;
    }

    public void setAbility_power(int ability_power) {
        this.ability_power = ability_power;
    }

    public int getAttack_speed() {
        return attack_speed;
    }

    public void setAttack_speed(int attack_speed) {
        this.attack_speed = attack_speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
