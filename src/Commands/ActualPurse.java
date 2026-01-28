package Commands;

import Characters.Player;

public class ActualPurse implements Command {
    Player p;


    @Override
    public String execute(String command) {
        return "Your purse is: " + p.getPurse();
    }

    @Override
    public boolean exit() {
        return false;
    }
}
