package Commands;

import Other.Console;

public class Help implements Command {
    Console console;
    @Override
    public String execute(String command) {
        return "commands: Achivements, Buy, Drop, Fight, HowToPlay, PickUp, PickOff, PutOn, Speak, WalkTo, WhereToGo, actualpurse";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
