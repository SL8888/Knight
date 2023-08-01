package Ammunation.Armor;

import Ammunation.Ammunation;

public abstract class Armor extends Ammunation {
    public int defense;

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getDurability() {
        return durability;
    }

    public int getDamage() {
        return 0;
    }

    public int getHealth() {
        return 0;
    }

    public String getType() {
        return type;
    }
}
