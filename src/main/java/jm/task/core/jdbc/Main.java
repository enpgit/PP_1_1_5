package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        Util.getConnection();
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Павел","Иванов", (byte) 30);
        userService.saveUser("Сергей","Смирнов", (byte) 25);
        userService.saveUser("Дмитрий","Сергеев", (byte) 51);
        userService.saveUser("Константин","Шацкий", (byte) 23);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
        Util.closeSessionFactory();
        Util.closeConnection();
    }
}
