package Commands;

import Other.Console;

import java.io.*;

public class Achievements implements Command{

    final Console console;


    public Achievements(Console console) {
        this.console = console;

    }

    @Override
    public String execute(String command) {


//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter("TextResources/Achievements.txt", false));
//
//            String AchievementInput = "";
//
//            writer.write(AchievementInput);
//            writer.newLine();
//
//            writer.flush();
//             //  TODO Dodelat metodu write Achievement
//
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (Exception e){
//            e.getMessage();
//        }
//
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
