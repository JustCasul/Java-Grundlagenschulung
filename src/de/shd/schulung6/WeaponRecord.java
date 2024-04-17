package de.shd.schulung6;

public record WeaponRecord(WeaponType weaponType, String name, int damage) {

    public int getTotalDamage() {
        return damage + weaponType.getBaseDamage();
    }

}