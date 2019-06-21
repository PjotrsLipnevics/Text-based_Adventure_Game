package Utils;

public class Scenario extends MainUtils {
    protected static void scenario(String scenario) {
        switch (scenario) {
            case "intro":
                System.out.print("SCENARIO:\n\n" +
                        "It was supposed to be just a next boring day.\n" +
                        "You went out. On the street you've noticed a messenger surrounded by crowd.\n" +
                        "Messenger reported of some weird animal attacks around town and recruitment.\n" +
                        "You decided to offer your help and sign in for a mission.\n" +
                        "Messenger gives you a list and you write it.\n" +
                        "What will be your name?\n");
                setPlayerName();
                playerStatsGenerator();
                break;
            case "intro1":
                System.out.print("\nYou can begin your adventure, but what would you like do first?\n" +
                        "\ta) View my stats\n" +
                        "\tb) View my equipment\n" +
                        "\tc) View my inventory\n" +
                        "\td) Begin my adventure\n" +
                        "*What would you like to do?\n");
                firstChoice();
                break;
            case "first steps":
                System.out.print("\nAfter thinking a while, you came to idea that you have a few ways\n" +
                        "\ta) Visit your home\n" +
                        "\tb) Visit Central square\n" +
                        "\tc) Go to town gate\n" +
                        "*Where would you like to go?\n");
                town1();
                break;
            case "visit home":
                System.out.print("\nYou decided to take a look at home, if there is something handy.\n" +
                        "That was a good idea, at home you have some medicine left.\n" +
                        "You have no armors or weapons at home, but your old knife can be handy too.\n" +
                        "\ta) Take medicine\n" +
                        "\tb) Take knife\n" +
                        "\tc) Go to Central square\n" +
                        "\td) Go to Town gate\n" +
                        "What would you like to do?\n");
                homeChoice();
                break;
            case "Central square":
                System.out.print("Central Square\n" +
                        "When you arrive, you didn't find some handy places to visit only the old lady sitting on a bench.\n" +
                        "Seems like she doesn't feel good.\n" +
                        "What will you do?\n" +
                        "\ta) Speak with old lady\n" +
                        "\tb) Go to Town gate\n");
                centralSquare();
                break;
            case "Town gate":
                System.out.print("Town Gate");

                break;
            case "old lady":
                System.out.print("Old lady\n" +
                        "You started to speak with that old lady.\n" +
                        "She told that a while ago she fell sick and she doesn't have money for doctor\n" +
                        "\ta) If you have a medicine you can help her to get well\n" +
                        "\tb) Continue listening\n" +
                        "\tc) Leave\n");
                oldLady();
                break;
//            case "":
//            System.out.print("");
//
//            break;
//            case "":
//            System.out.print("");
//
//            break;
//            case "":
//            System.out.print("");
//
//            break;

        }
    }
}
