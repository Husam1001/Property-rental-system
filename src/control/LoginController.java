package control;

import model.Login.Login;
import model.User.User;
import view.LoginPage;

public class LoginController {
    public static User login(LoginPage loginPage){
        String username= loginPage.getUserNameTextField().getText();
        String password= String.valueOf(loginPage.getPasswordField().getPassword());
        User user= Login.login("Agent",username,password);
        return user;
    }
}
