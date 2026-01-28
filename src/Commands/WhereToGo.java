package Commands;

public class WhereToGo implements Command {


    final Other.Console console;

    public WhereToGo(Other.Console console) {

        this.console = console;
    }


    /**
     *
     * @param command implements command base
     * @return returns rooms where player might go - based on his current location.
     */
    @Override
    public String execute(String command) {

        if (console.getActiveRoom() == null) {
            return "You are not in a room...";
        }
        return console.getActiveRoom().getAviableRooms().toString();
    }

    @Override
    public boolean exit() {
        return false;
    }
}
