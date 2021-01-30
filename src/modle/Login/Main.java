package modle.Login;

import modle.Property.Bungalow;
import modle.Property.Property;
import modle.Property.PropertyFactory;
import modle.User.User;

public class Main {
    public static void main(String[] args) {
	User user=Login.login("Admin","husam","pass123");
	System.out.println(user.getName());
//		Property property= PropertyFactory.getProperty("Bungalow");
//		((Bungalow)property).clickA();



    }
}
