package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        Util.getConnection();
        UserDao userDao = new UserDaoHibernateImpl();
        userDao.createUsersTable();
        userDao.saveUser("Павел","Иванов", (byte) 30);
        userDao.saveUser("Сергей","Смирнов", (byte) 25);
        userDao.saveUser("Дмитрий","Сергеев", (byte) 51);
        userDao.saveUser("Константин","Шацкий", (byte) 23);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();



    }
}
