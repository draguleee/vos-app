package vos.desktop.database;

import java.sql.*;

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
            conn = DriverManager.getConnection("jdbc:mysql://localhost/vosdesktop_db?" + "user=root&password=admin16&useSSL=false&allowPublicKeyRetrieval=True");
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
    
    // Method to add user in database
    public boolean insertUser(String firstName, String lastName, String email, String password) {
        PreparedStatement preparedStatement = null;
        try {
            ResultSet resultSet;
            String countEmails = "SELECT COUNT(*) FROM USERS WHERE email = ?";
            preparedStatement = conn.prepareStatement(countEmails);
            preparedStatement.setString(1, email);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                if(resultSet.getInt(1) > 0) {
                    return false;
                }
            }
            String insertQuery = "INSERT INTO USERS(firstName, lastName, email, password) VALUES (?, ?, ?, ?)";
            preparedStatement = conn.prepareStatement(insertQuery);
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, password);
            int result = preparedStatement.executeUpdate();
            return (result == 1);
            
        }
        catch(Exception e) {
            System.out.println("Insert user error: " + e.getMessage());
        }
        return false;
    }
    
    /**
     * Function name: checkCredentials
     * @param email
     * @param password
     * @return id of the user logged in, in care of success <br>
     * -1 in case of error
     */
    public int checkCredentials(String email, String password) {
        String query = "SELECT id FROM USERS WHERE email = ? AND password = ?";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, email);
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
