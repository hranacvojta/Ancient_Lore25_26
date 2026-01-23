package Commands;

public class Fight implements Command {
    @Override
    public String execute(String command) {
        return "fight";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
