package Commands;

public class Achievements implements Command {

    @Override
    public String execute(String command) {
        return "achivements";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
