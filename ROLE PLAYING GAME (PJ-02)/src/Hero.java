public class Hero extends Pers {
    private int exp, gold;

    public Hero(String name, int HP, int strength, int agility, int exp, int gold) {
        super(name, HP, strength, agility);
        this.exp = exp;
        this.gold = gold;
    }

    public int getExp() {
        return exp;
    }

    public int getGold() {
        return gold;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void loot () {
        int i = (int)(Math.random()*20);
        setExp(getExp()+100);
        setGold(getGold()+i);
        System.out.println(String.format("Получено 100 опыта и %d золота", i));

    }

    public void getlvl() {
        setExp(0);
        setStrength(getStrength()+1);
        setAgility(getAgility()+1);
        System.out.println("Получен новый уровень, сила и ловкость увеличены");
    }


    @Override
    public String toString() {
        return String.format("%s HP %d, сила %d ловкость %d опыт %d золото %d", this.getName(), this.getHP(),this.getStrength(),this.getAgility(),this.getExp(),this.getGold());
    }
}
