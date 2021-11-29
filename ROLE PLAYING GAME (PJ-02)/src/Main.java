import java.util.Scanner;

public class Main {

    private static Hero currenthero = null;

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        String command = "";


        System.out.println("Введите имя персонажа:");
        command = in.next();

        if (currenthero == null) currenthero = new Hero(command, 100, 20, 25, 0, 10);
        command = "";

        allway();

        while (!command.equals("4")) {
            command = in.next();
            switch (command) {
                case "1": {
                    tradeway();

                    while (!command.equals("n")) {
                        command = in.next();
                        switch (command) {
                            case "y": {
                                buypotion();
                                tradeway();
                            }
                            case "n": {}


                        }
                    }
                    allway();
                    break;
                }


                case "2": { Meeting m = new Meeting();
                    m.Fight(currenthero, enemy());
                    currenthero.loot();
                    if (currenthero.getExp()>=500) currenthero.getlvl();
                    allway();
                    break;
                }
                case "3":
                    System.out.println(currenthero.toString());
                    allway(); break;
                case "4": break;


            }
        }
    }

    private static void allway() {
        System.out.println("Куда вы хотите пойти?");
        System.out.println("1. К Торговцу");
        System.out.println("2. В темный лес");
        System.out.println("3. Проверить состояние героя");
        System.out.println("4. Выход");
    }

    private static void tradeway() {
        System.out.println("Торговец продает лечебное зелье за 10 золотых. Купить?");
        System.out.println("y Купить");
        System.out.println("n Уйти");
    }

    private static void buypotion() {
        if (currenthero.getGold() >= 10) {
            currenthero.setGold(currenthero.getGold()-10);
            currenthero.setHP(100);
            System.out.println("Герой полностью здоров");
        }
    }

    private static Pers enemy() {
        if (Math.random() >= 0.5) return new Goblin("Гоблин", 50, 5,20);
        else return new Skelet("Скелет", 40, 8,15);
    }
}


