package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private static final UserServiceImpl usi = new UserServiceImpl();
    public static void main(String[] args) {
        usi.createUsersTable();

        usi.saveUser("name", "lastname", (byte)20);
        usi.saveUser("name2", "lastname2", (byte)21);
        usi.saveUser("name3", "lastname3", (byte)22);
        usi.saveUser("name4", "lastname4", (byte)23);

        System.out.println(usi.getAllUsers());

        usi.cleanUsersTable();
        usi.dropUsersTable();


    }
}
