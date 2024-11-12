package Exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLExceptionExample {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nonexistentDB", "root", "password");
        } catch (SQLException e) {
            System.out.println("Caught SQLException: " + e.getMessage());
        }
    }
}

