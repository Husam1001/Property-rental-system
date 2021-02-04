package model.Login;

public class LoggerFactory {
    //LoggingOperation instance;
    public static LoggingOperation getInstance(String logger){
        return switch (logger) {
            case "Admin" -> new AdminLogging();
            case "Customer" -> new CustomerLogin();
            case "Agent" -> new AgentLogin();
            default -> null;
        };
    }
}
