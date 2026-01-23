package Commands;


public class HowToPlay implements Command {
    @Override
    public String execute(String command) {
        return "how to play";}

    @Override
    public boolean exit() {
        return false;
    }
}
