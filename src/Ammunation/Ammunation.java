package Ammunation;

public abstract class Ammunation {
    public int cost;

    public int getCost() {
        return cost;
    }


    public int getSortableValue(SortType sortType) {

        return switch (sortType) {
            case DEFENSE -> getDefense();
            case HEALTH -> getHealth();
            case DAMAGE -> getDamage();
            case DURABILITY -> getDurability();
            default -> cost;
        };
    }

    public int durability;

    public int getDurability() {
        return durability;
    }

    public String type;

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract int getDefense();

    public abstract int getDamage();

    public abstract int getHealth();

    @Override
    public String toString() {
        return "cost is " + getCost() +
                "; defense is " + getDefense() +
                "; health is " + getHealth() +
                "; damage is " + getDamage() +
                "; durability is " + getDurability() +
                "; type is " + getType() + ";";
    }
}
