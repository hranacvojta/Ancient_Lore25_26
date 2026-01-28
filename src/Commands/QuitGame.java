package Commands;

public class QuitGame implements Command{


    /**
     * @param command command interface - base for commands
     * @return returns string which lets player know that the game is shutting down.
     * @boolean exit - sets to shut down the game
     */


    @Override
    public String execute(String command) {
        return "You have left the game...";
    }

    @Override
    public boolean exit() {
        return true;
    }
}
