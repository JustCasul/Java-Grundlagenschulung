package de.shd.schulung6;

public enum WeaponType {
    SCHWERT(30),
    AXT(40),
    BOGEN(35),
    MORGENSTERN(45),
    ZWEIHAENDER(50);

    private final int baseDamage;

    WeaponType(int damage){
        this.baseDamage = damage;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

}