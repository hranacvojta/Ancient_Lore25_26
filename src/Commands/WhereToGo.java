package Commands;

public class WhereToGo implements Command {


    final Other.Console console;
    public WhereToGo(Other.Console console) {

        this.console = console;
    }


    @Override
    public String execute(String command) {

        if (console.getActiveRoom() == null) {
            return "Chyba: Nejsi v žádné místnosti.";
        }
        return console.getActiveRoom().getAviableRooms().toString();
    }

    @Override
    public boolean exit() {
        return false;
    }
}
