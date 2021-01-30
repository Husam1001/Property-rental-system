package control;

import modle.User.User;

public class Session {
    public static User user;

    public static void setUser(User user) {
        Session.user = user;
    }
    public static User getUser() {
        return user;
    }
    public static boolean destroy(){
        Session.user=null;
        return true;
    }
    public static boolean isEmpty(){
        return Session.user == null;
    }
}
