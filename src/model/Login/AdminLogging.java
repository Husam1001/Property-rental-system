package model.Login;

import model.User.Agent;
import model.User.User;

public class AdminLogging implements LoggingOperation{

    @Override
    public User login(String userName,String password) {
        return new Agent(100, "Admin","Admin@admin","+60111111111");
    }
}
