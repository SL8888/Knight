package Ammunation.Weapon;

import Ammunation.Ammunation;

public abstract class Weapon extends Ammunation {
    public int damage;

    public int getDefense() {
        return 0;
    }

    public int getDurability() {
        return durability;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return 0;
    }

    public String getType() {
        return type;
    }
}
