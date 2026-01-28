package Commands;

import Characters.Player;
import Characters.SmithCharacter;
import Items.Weapon;
import Other.Console;
import Other.GameData;

import java.util.Scanner;

public class Buy implements Command {

    private final Other.Console console;
    Scanner scanner = new Scanner(System.in);
    private GameData data;
    private Player p;

    public Buy(Console console, GameData data, Player p) {
        this.console = console;
        this.data = data;
//        this.p = ;

    }


    @Override
    public String execute(String command) {
        String input = "";


        if (console.getActiveRoom().getId().equals("zdusynadsazavou")) {
            System.out.println("what type if item do you want to buy?");
            System.out.println("1. for weapons...");
            System.out.println("2. for armor and shields...");

            switch (scanner.nextInt()) {
                case 1:
                    for (int i = 0; i < data.getTheSmith().get(0).getWeaponsStore().size(); i++) {
                        System.out.println(data.getTheSmith().get(0).getWeaponsStore().get(i));
                    }
                    System.out.println("type the name of the weapon");
                    input = scanner.nextLine().trim().toLowerCase();
                    for (int i = 0; i <  data.getTheSmith().get(0).getWeaponsStore().size(); i++) {
                        if (data.getTheSmith().get(0).getWeaponsStore().get(i).getId().equals(input)) {
                            if (data.getTheSmith().get(0).getWeaponsStore().get(i).getPrice()>p.getPurse()){
                                System.out.println("You do not have enough money to buy this.");
                            }
                            p.getPlayersInvetory().add(data.getTheSmith().get(0).getWeaponsStore().get(i));
                            p.setPurse(p.getPurse()-data.getTheSmith().get(0).getWeaponsStore().get(i).getPrice());
                            System.out.println("You bought: " + data.getTheSmith().get(0).getWeaponsStore().get(i).getItemName());
                        }
                    }
                case 2:
                    for (int i = 0; i < data.getTheSmith().get(0).getArmorStore().size(); i++) {
                        System.out.println(data.getTheSmith().get(0).getArmorStore().get(i));
                    }
                    System.out.println("type the name of the weapon");
                    input = scanner.nextLine().trim().toLowerCase();
                    for (int i = 0; i <  data.getTheSmith().get(0).getArmorStore().size(); i++) {
                        if (data.getTheSmith().get(0).getArmorStore().get(i).getId().equals(input)) {
                            if (data.getTheSmith().get(0).getArmorStore().get(i).getPrice()>p.getPurse()){
                                System.out.println("You do not have enough money to buy this.");
                            }
                            p.getPlayersInvetory().add(data.getTheSmith().get(0).getArmorStore().get(i));
                            p.setPurse(p.getPurse()-data.getTheSmith().get(0).getArmorStore().get(i).getPrice());
                            System.out.println("You bought: " + data.getTheSmith().get(0).getArmorStore().get(i).getItemName());
                        }
                    }
                    default:
                        System.out.println("choose from the options...");
            }
        }else{
            System.out.println("You are not in the Zdusy nad Sazavou");
        }


        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
