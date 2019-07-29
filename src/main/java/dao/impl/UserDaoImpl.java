package dao.impl;

import dao.UserDao;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private static List<User> userList = new ArrayList<User>();

    public void addUser(User user) {
        userList.add(user);
    }

    public List<User> getAllUsers() {
        return userList;
    }
}
