package org.example.leaderProject.day5;

import java.sql.*;
import java.time.LocalDate;
import java.util.Optional;
import java.util.Scanner;

public class BookingReservation {
    /**
     * <TODO>
     * 유저의 userID와 목적지를 하나를 받습니다.
     * 목적지로 가는 '왕복' 또는 '편도' 항공권 중 가장 출발이 빠른 항공권으로 예약을 진행 합니다.
     * 만약 가는 목적지로 가는 항공권'이 없다고 하고 예약을 진행하지 않습니다.
     * 만약 userId에 해당하는 Passenger ID가 없다면 RuntimeException를 뱉어야 합니다.
     */

    // MySQL 데이터베이스 연결 정보
    private static final String DB_URL = "jdbc:mysql://localhost:3306/super_coding";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "1111";

    public static void main(String[] args) {
        // TODO: 가고싶은 목직지로 가는 항공권 중 가장 빠른 것 하나를 찾는 쿼리
        String sqlQuery = "SELECT * FROM airline_ticket " +
                "WHERE arrival_loc = ? " +
                "ORDER BY departure_at ASC " +
                "LIMIT 1";

        // TODO: userId로 PassengerId 가져오는 쿼리
        String sqlQuery2 = "SELECT passenger_id FROM passenger " +
                "WHERE user_id = ? ";

        // TODO: 예약하는 SQL 구문
        String sqlInsert = "INSERT INTO reservation (passenger_id, airline_ticket_id, reservation_status, reserve_at) " +
                "VALUES (?,?,?,?) ";

        Scanner scanner = new Scanner(System.in);
        System.out.println("예약할 userId 입력해주세요~ ");
        Integer userId = Integer.valueOf(scanner.nextLine());
        System.out.println("가고 싶은 항공권 목적지를 입력해주세요~");
        String destination = scanner.nextLine();

        // TODO: Connection 연결 및 Statement 정의
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement preparedStatement1 = connection.prepareStatement(sqlQuery);
             PreparedStatement preparedStatement2 = connection.prepareStatement(sqlQuery2);
             PreparedStatement preparedStatement3 = connection.prepareStatement(sqlInsert);
        ) {

            // TODO: 가고싶은 목직지로 가는 항공권 중 가장 빠른 airline의 ticketId 가져오기
            preparedStatement1.setString(1, destination);
            ResultSet resultSet = preparedStatement1.executeQuery();

            Integer ticketId = null;
            if (resultSet.next()) ticketId = resultSet.getInt("ticket_id");
            System.out.println("가고싶은 목적지를 가는 티켓 ID를 찾았습니다~ : " + ticketId);
            if (ticketId == null) {
                System.out.println("목적지로 가는 항공권이 없습니다. 예약이 불가합니다.");
                return;
            }
            // TODO: userId에 해당하는 passengerId 가져오기

            preparedStatement2.setInt(1, userId);
            ResultSet resultSet2 = preparedStatement2.executeQuery();

            Integer passengerIdRow = null;
            if (resultSet2.next()) passengerIdRow = resultSet2.getInt("passenger_id");

            Integer passengerId = Optional.ofNullable(passengerIdRow).orElseThrow(() -> new RuntimeException("해당 ID가 없습니다."));

            // TODO: passengerId, ticketId로 예약하기 ( 처음 상태는 대기 )
            preparedStatement3.setInt(1, passengerId);
            preparedStatement3.setInt(2, ticketId);
            preparedStatement3.setString(3, "대기");
            preparedStatement3.setDate(4, Date.valueOf(LocalDate.now()));

            preparedStatement3.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
