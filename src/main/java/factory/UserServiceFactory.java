package factory;

import service.UserService;
import service.impl.UserServiceImpl;

public class UserServiceFactory {
    private static UserService instance;

    private UserServiceFactory(){

    }

    public static synchronized UserService getUserService() {
        if (instance == null) {
            instance = new UserServiceImpl();
        }
        return instance;
    }
}
