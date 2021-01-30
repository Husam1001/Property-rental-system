package modle.Login;

import modle.User.Agent;
import modle.User.User;

public class CustomerLogin implements LoggingOperation{
    @Override
    public User login(String userName,String password) {
        return new Agent(100, "Hasaan","Admin@admin","+60111111111");
    }
}
