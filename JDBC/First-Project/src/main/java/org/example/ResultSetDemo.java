package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetDemo {
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

            //create statement
            Statement statement = connection.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE
            );

            //craete query
            String query = "select * from students";
            ResultSet resultSet = statement.executeQuery(query);

            resultSet.last();
            System.out.println("Fetching last row...");
            System.out.println("ID: " + resultSet.getInt("id"));
            System.out.println("Name: " + resultSet.getString("name"));
            System.out.println("Course: " + resultSet.getString("course"));

            resultSet.first();
            System.out.println("Fetching last row...");
            System.out.println("ID: " + resultSet.getInt("id"));
            System.out.println("Name: " + resultSet.getString("name"));
            System.out.println("Course: " + resultSet.getString("course"));

            resultSet.updateString("name", "Ritesh");
            resultSet.updateRow();

            resultSet.moveToInsertRow();
            resultSet.updateInt("id", 5);
            resultSet.updateString("name", "Poonam");
            resultSet.updateString("course", "Java");
            resultSet.insertRow();

            resultSet.last();
            System.out.println("Fetching last row...");
            System.out.println("ID: " + resultSet.getInt("id"));
            System.out.println("Name: " + resultSet.getString("name"));
            System.out.println("Course: " + resultSet.getString("course"));

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
