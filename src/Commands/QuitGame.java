package Commands;

public class QuitGame implements Command{
    @Override
    public String execute(String command) {
        return "You have left the game...";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
