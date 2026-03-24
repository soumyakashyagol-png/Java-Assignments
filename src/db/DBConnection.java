package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() throws Exception {

        String url = "jdbc:mysql://localhost:3306/studentSkillDB";
        String user = "root";
        String password = "Soumya@3002#";

        Class.forName("com.mysql.cj.jdbc.Driver");

        return DriverManager.getConnection(url, user, password);
    }
}