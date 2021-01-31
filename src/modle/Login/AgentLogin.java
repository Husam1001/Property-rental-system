package modle.Login;

import modle.User.Agent;
import modle.User.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AgentLogin implements LoggingOperation {
   private Agent agent=null;
    public  void agentLogin(String userName, String password) throws FileNotFoundException {
        File file = new File("src/assets/files/AgentInfo.txt");
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
                        //return id;
                        agent=new Agent(Integer.parseInt(id),read.next(),read.next(),read.next());
                    }
                    read.nextLine();
                }
                return ;
            } catch (Exception e) {
                System.out.println(e);
            }
        } else System.out.println("modle.file not exist");
        return;
    }

    @Override
    public User login(String userName, String password) {
        try {
            agentLogin(userName, password);
            if (agent != null) {
                return agent ;
            } else return null;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }


}
