package modle.Login;

import modle.User.Agent;
import modle.User.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AgentLogin implements LoggingOperation {

    @Override
    public User login(String userName,String password) {
        try {
            if (agentLogin(userName, password) != null){
                return new Agent(100,"Husam","Admin@admin","+60111111111");
            }else return null;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static String agentLogin(String userName, String password) throws FileNotFoundException {
        File file = new File("src/file/AgentLogin.txt");
        String id;
        String tempUser;
        String tempPass;
        if (file.exists()) {
            Scanner read = new Scanner(file);
            try {
                read.useDelimiter("<>");
                while (read.hasNext()) {
                    id = read.next();
                    tempUser = read.next();
                    tempPass = read.next();
                    if (userName.equals(tempUser) && password.equals(tempPass)) {
                        return id;
                    }
                }
                return null;
            } catch (Exception e) {
                System.out.println(e);
            }
        } else System.out.println("file not exist");
        return null;
    }


}
