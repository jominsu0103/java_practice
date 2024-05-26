package assignments.week1.assignment1.leaderAssignment.week2.day5;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("유저명을 입력하세요: ");
        String username = reader.next();
        System.out.print("권한을 입력하세요 (admin 또는 user): ");
        String role = reader.next();


        try (Socket socket = new Socket("localhost", 1234)) {
            System.out.println("서버에 연결되었습니다.");


            OutputStream outputStream = socket.getOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);


            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));


            UserDTO userDTO = new UserDTO(username, role);


            objectOutputStream.writeObject(userDTO);
            objectOutputStream.flush();
            System.out.println("유저 정보를 서버로 보냈습니다.");


            String response = bufferedReader.readLine();
            System.out.println("서버의 응답: " + response);

            System.out.println("Client가 종료되었습니다.");

            objectOutputStream.close();
            bufferedReader.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
