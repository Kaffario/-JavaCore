import java.util.Random;

public abstract class Pers {
    private String name;
    private int HP, strength, agility;

    public Pers(String name, int HP, int strength, int agility) {
        this.name = name;
        this.HP = HP;
        this.strength = strength;
        this.agility = agility;
    }

    public int Hit() {
        if (agility*3 >= new Random().nextInt(101)) return strength;
        else return 0;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public String getName() {
        return name;
    }



}

