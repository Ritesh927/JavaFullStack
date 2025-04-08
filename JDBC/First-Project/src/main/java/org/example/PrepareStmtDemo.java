package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PrepareStmtDemo {
    public static String LOAD_DRIVER = "com.mysql.cj.jdbc.Driver";

    public static String URL = "jdbc:mysql://localhost:3306/studentdb";

    public static String PASSWORD = "welcome";

    public static String USERNAME = "root";

    public static void main(String[] args) {
        try {
            //load driver
            Class.forName(LOAD_DRIVER);

            //making connection
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            String query = "delete from students where id=?";

            //create statement
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, 5);
            int rowImpacted = preparedStatement.executeUpdate();

            System.out.println("Row Impacted: " + rowImpacted);

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
