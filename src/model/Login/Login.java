package model.Login;

import model.User.User;

public class Login {
    public static User login(String logger,String userName,String password){
        LoggingOperation instance = LoggerFactory.getInstance(logger);
       return instance.login(userName,password);
    }
}
