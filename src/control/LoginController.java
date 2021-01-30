package control;

import modle.Login.Login;
import modle.User.User;
import view.LoginPage;

public class LoginController {
    public static User login(LoginPage loginPage){
        String username= loginPage.getUserNameTextField().getText();
        String password= loginPage.getPasswordfild().getText();
        User user= Login.login("Agent",username,password);
        //Session.setUser();
        return user;
    }
}
