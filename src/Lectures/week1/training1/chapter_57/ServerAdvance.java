package Lectures.week1.training1.chapter_57;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerAdvance {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        try (ServerSocket serverSocket = new ServerSocket(1234);
        ) {
            System.out.println("server start");
            while (true) {
                try (Socket clientSocket = serverSocket.accept();) {
                    System.out.println("client linked start");

                    InputStream clientInputStream = clientSocket.getInputStream();
                    ObjectInputStream objectInputStream = new ObjectInputStream(clientInputStream);

                    OutputStream serverOutputStream = clientSocket.getOutputStream();
                    PrintWriter printWriter = new PrintWriter(serverOutputStream, true);

                    Customer customer = (Customer) objectInputStream.readObject();

                    customerList.add(customer);
                    System.out.println(customer + "가 대기명단에 추가되었습니다.");
                    printWriter.println("고객 대기명단 : " + customerList);

                    printWriter.println("server response");
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
