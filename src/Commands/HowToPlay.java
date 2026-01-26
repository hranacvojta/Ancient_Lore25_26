package Commands;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

public class HowToPlay implements Command {



    @Override
    public String execute(String command) {
//        ArrayList<String> list = new ArrayList<>();
//        try(BufferedReader br = new BufferedReader(new FileReader("TextResources/HowToPlay.txt"))){
//            String line = "";
//            while((line = br.readLine())!=null){
//                list.add(line);
//            }
//            Random rnd = new Random();
//            return list.get(rnd.nextInt(list.size()));
//        }catch(Exception e){
            return "asda dsd.";
//        }
    }

    @Override
    public boolean exit() {
        return false;
    }
}
