package Ammunation.Jewelry;

import Ammunation.Ammunation;

public abstract class Jewelry extends Ammunation {
    public int health;

    public int getDefense() {
        return 0;
    }

    public int getDurability() {
        return durability;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return 0;
    }

    public int getHealth() {
        return health;
    }

    public String getType() {
        return type;
    }
}

