package Utils;

import java.util.Random;
import java.util.Scanner;

class MainUtils {
    private static String playerName, option;
    private static Inventory inventory = new Inventory();
    private static Player player = new Player(playerName);
    private static Scanner input = new Scanner(System.in);


    static void setPlayerName() {
        do {
            playerName = input.nextLine();
        } while (playerName.length() < 1);
        player.setName(playerName);
    }

    private static String optionInput() {
        do {
            option = input.nextLine();
        } while (option.length() != 1);
        return option;
    }

    static void playerStatsGenerator() {
        Random rand = new Random();
        player.setHealth(rand.nextInt(40) + 100);
        player.setDefence(rand.nextInt(10) + 5);
        player.setDamage(rand.nextInt(10) + 5);
        player.setLuck(rand.nextInt(10));
    }

    private static void viewStats() {
        System.out.printf("%s's stats:\n", player.getName());
        System.out.printf("\tHealth\t:\t%d\n", player.getHealth());
        System.out.printf("\tDefence\t:\t%d\n", player.getDefence());
        System.out.printf("\tDamage\t:\t%d\n", player.getDamage());
        System.out.printf("\tLuck\t:\t%d\n", player.getLuck());
    }

    private static void viewEquipment() {
        System.out.printf("%s's equipment:\n", player.getName());
        System.out.printf("\tArmor\t:\t%b\n", player.getArmor());
        System.out.printf("\tWeapon\t:\t%b\n", player.getWeapon());
    }

    private static void viewInventory() {
        System.out.printf("%s's inventory:\n", player.getName());
        for (String item : inventory.getInventory()) {
            System.out.println("\t>>  " + item);
        }
    }

    static void firstChoice() {
        while (true) {
            switch (optionInput()) {
                case "a":
                    viewStats();
                    continue;
                case "b":
                    viewEquipment();
                    continue;
                case "c":
                    viewInventory();
                    continue;
                case "d":
                    Scenario.scenario("first steps");
                    break;
            }
        }
    }

    static void town1() {
        switch (optionInput()) {
            case "a":
                Scenario.scenario("visit home");
                break;
            case "b":
                Scenario.scenario("Central square");
                break;
            case "c":
                Scenario.scenario("Town gate");
                break;
        }
    }


    static void homeChoice() {
        while (true) {
            switch (optionInput()) {
                case "a":
                    inventory.add("Small medicine");
                    viewInventory();
                    continue;
                case "b":
                    inventory.add("Old knife");
                    viewInventory();
                    continue;
                case "c":
                    Scenario.scenario("Central square");
                    break;
                case "d":
                    Scenario.scenario("Town gate");
                    break;
            }
        }
    }

    static void centralSquare() {
        switch (optionInput()) {
            case "a":
                Scenario.scenario("old lady");
                break;
            case "b":
                Scenario.scenario("Town gate");
                break;
        }
    }

    static void oldLady() {
        switch (optionInput()) {
            case "a":
                if (inventory.getInventory().contains("Small medicine")) {
                    System.out.print("You told her that you have some medicine with you.\n" +
                            "You pass medicine to her and instruct of how to use it.\n" +
                            "She thanks and gives a ring to you.\n" +
                            "- \"It's my lucky ring I'm too old and don't need it any more, but for you it can be much more useful.\"\n");
                    inventory.remove("Small medicine");
                    inventory.add("Lucky ring");
                    viewInventory();
                    System.out.print("You chat a little bit more and she tells you that behind Town gate is a small cave.\n" +
                            "- A long time ago, it was occupied by thieves guid, but now it's empty and there still can be something.\n" +
                            "You wish to get well to her and take your way to a Town gate.\n");
                    Scenario.scenario("Town gate");
                } else {
                    System.out.print("You thought that you have some medicine left but you didn't find any in inventory.\n" +
                            "She told that she want's to thank you for being kind, so she will tell you a rumor:\n" +
                            "She tells that behind Town gate is a small cave.\n" +
                            "- A long time ago, it was occupied by thieves guid, but now it's empty and there still can be something\n" +
                            "You wish a good luck to her and take your way to a Town gate.\n");
                    Scenario.scenario("Town gate");
                }
                break;
            case "b":
                System.out.print("You chat a little bit and she tells you that she likes you, so she will tell you an interesting rumor\n" +
                        "She tells that behind Town gate is a small cave.\n" +
                        "- A long time ago, it was occupied by thieves guid, but now it's empty and there still can be something\n" +
                        "You wish a good luck to her and take your way to a Town gate.\n");
                Scenario.scenario("Town gate");
                break;
            case "c":
                System.out.print("You decide that it's enough for you and leave.\n" +
                                "Now your path lies to a Town gate\n");
                Scenario.scenario("Town gate");
                break;
        }
    }
}



