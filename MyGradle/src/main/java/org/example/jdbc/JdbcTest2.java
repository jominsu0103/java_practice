package org.example.jdbc;

import java.sql.*;
import java.time.LocalDate;
import java.util.Optional;
import java.util.Scanner;

public class JdbcTest2 {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/super_coding";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "1111";

    public static void main(String[] args) {
        String sqlQuery1 = "SELECT user_id, user_name, like_travel_place " +
                "FROM users " +
                "WHERE user_name = ?";
        String sqlQuery2 = "SELECT ticket_type , departure_loc, arrival_loc,departure_at,return_at,total_price " +
                "FROM airline_ticket " +
                "WHERE departure_loc = '서울' AND ticket_type = '왕복' AND arrival_loc = ?" +
                "ORDER BY total_price";

        System.out.println("유저 이름을 입력 :");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement preparedStatement1 = connection.prepareStatement(sqlQuery1);
             PreparedStatement preparedStatement2 = connection.prepareStatement(sqlQuery2);
        ) {
            preparedStatement1.setString(1, userName);
            ResultSet resultSet = preparedStatement1.executeQuery();
            String place = null;
            if (resultSet.next()) {
                place = resultSet.getNString("like_travel_place");
            }
            Optional<String> LikeTravelPlace = Optional.ofNullable(place);
            String likePlace = LikeTravelPlace.orElseThrow(() -> new RuntimeException());
            System.out.println("선호하는 곳은 : " + likePlace);

            preparedStatement2.setString(1, likePlace);
            ResultSet resultSet1 = preparedStatement2.executeQuery();

            while (resultSet1.next()) {
                String ticketType = resultSet1.getNString("ticket_type");
                String departureLoc = resultSet1.getString("departure_loc");
                LocalDate departureAt = resultSet1.getDate("departure_at").toLocalDate();
                String arrivalLoc = resultSet1.getString("arrival_loc");
                LocalDate arrivalAt = resultSet1.getDate("return_at").toLocalDate();
                System.out.println("type : " + ticketType + ", 출발지 : " + departureLoc + ", 도착지 : " + arrivalLoc
                        + ", 출국 날짜 : " + departureAt + ", 왕복도착 날짜 : " + arrivalAt);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
