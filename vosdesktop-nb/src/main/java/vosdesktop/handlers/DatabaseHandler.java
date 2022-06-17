/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vosdesktop.handlers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseHandler {

    // Class variable
    Connection conn = null;
    private static DatabaseHandler handler = null;

    // DatabaseHandler constructor
    private DatabaseHandler() {
        createConnection();
    }

    // Method to create connection
    private void createConnection() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/vosdesktop_db?" +
                    "user=root&password=admin16&useSSL=false&allowPublicKeyRetrieval=true");
        }
        catch(Exception e) {
            System.out.println("Create connectionn exception " + e.getMessage());
        }
    }

    // Method to get instance
    public static DatabaseHandler getInstance() {
        if(handler == null) {
            handler = new DatabaseHandler();
        }
        return handler;
    }

    /**
     * Function name: checkCredentials
     * @param username
     * @param password
     * @return id of the user logged in, in case of success <br>
     * -1 in case of error
     */
    public int checkCredentials(String username, String password) {
        String query = "SELECT id FROM USERS WHERE username = ? AND password = ?";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                return resultSet.getInt(1);
            }
        }
        catch(SQLException e) {
            System.out.println("Check credentials error: " + e.getMessage());
        }
        return -1;
    }
}

