package org.example.jdbc;

import java.sql.*;

public class JdbcTest {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/super_coding";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "1111";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement statement = connection.createStatement()
        ) {
            String stringSQL = "SELECT * FROM group_singer G " +
                    "JOIN buy_history B ON G.mem_id = B.mem_id " +
                    "WHERE price >= 1000";

            ResultSet resultSet = statement.executeQuery(stringSQL);

            while (resultSet.next()) {
                String memId = resultSet.getString("mem_id");
                String memName = resultSet.getString("mem_name");
                Long price = resultSet.getLong("price");

                System.out.println("mem_id : " + memId + " mem_name : " + memName + " price : " + price);
            }

            String stringSQL1 = "INSERT INTO group_singer (mem_id, mem_name, mem_number, addr, phone, height, debut_date)" +
                    "VALUES ('M1212' ,'르세라핌',5,'서울',01012345421,172,'2022-12-06')";

            statement.executeUpdate(stringSQL1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
