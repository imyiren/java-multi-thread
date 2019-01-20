package io.ilss.part6.singleton_9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * className MyObject
 * description MyObject
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 12:55
 */
public enum MyObject {
    connectionFactory;
    private Connection connection;
    private MyObject() {
        try {
            System.out.println("call MyObject Constructor");
            String url = "jdbc:mysql://localhost/test";
            String username = "root";
            String password = "root1111";
            String driver = "";
            Class.forName(driver);
            //do database connect
            connection = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public Connection getConnection() {
        return connection;
    }
}
