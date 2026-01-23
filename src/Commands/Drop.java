package Commands;

public class Drop implements Command {
    @Override
    public String execute(String command) {
        return "drop";}

    @Override
    public boolean exit() {
        return false;
    }
}
