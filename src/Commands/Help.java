package Commands;

import Other.Console;

public class Help implements Command {
    Console console;
    @Override
    public String execute(String command) {
        return "commands:";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
