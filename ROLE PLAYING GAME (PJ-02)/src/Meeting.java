public class Meeting {
    public void Fight(Hero hero, Pers monster) {

        System.out.println(String.format("Вам встретился опасный %s", monster.getName()));

            int turn = 1;
            boolean check = true;

            while (check) {
                if (turn % 2 == 0) HitEnemy (hero, monster);
                    else HitEnemy(monster,hero);
                check = (hero.getHP() > 0 && monster.getHP() >0);
                turn++;
            }

    }

    public void HitEnemy (Pers damager, Pers defender) {

        int damage = damager.Hit();
        int newhp = defender.getHP() - damage;

        if (newhp <=0 && defender instanceof Hero) {
            System.out.println(String.format("Герой %s погиб в бою", defender.getName()));
            System.exit(1);
        }
            else if (newhp <=0) {
            System.out.println("Враг побеждён");

        }
            defender.setHP(newhp);
    }

}
