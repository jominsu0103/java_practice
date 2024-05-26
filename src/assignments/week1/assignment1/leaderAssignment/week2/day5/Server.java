package assignments.week1.assignment1.leaderAssignment.week2.day5;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();

        try (ServerSocket serverSocket = new ServerSocket(1234);
        ) {
            System.out.println("서버가 시작되었습니다.");

            while (true) {
                try (Socket clientSocket = serverSocket.accept()) {
                    System.out.println("클라이언트가 연결되었습니다.");

                    ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
                    UserDTO userDTO = (UserDTO) ois.readObject();
                    System.out.println("클라이언트로부터 받은 유저 정보: " + userDTO.getUserName());

                    User user;
                    if (userDTO.getRole().equals("admin")) {
                        user = new AdminUser(userDTO.getUserName());
                    } else {
                        user = new User(userDTO.getUserName());
                    }

                    userList.add(user);
                    System.out.println("새로운 유저가 등록되었습니다. " + userList);

                    OutputStream serverOutputStream = clientSocket.getOutputStream();
                    PrintWriter printWriter = new PrintWriter(serverOutputStream, true);

                    printWriter.println("현재 고객대기명단은: " + userList);

                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
