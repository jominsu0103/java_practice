package Lectures.week1.training1.chapter_57;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1234);
             Socket clientSocket = serverSocket.accept();
        ) {
            System.out.println("server start");
            System.out.println("client linked start");

            InputStream clientInputStream = clientSocket.getInputStream();
            BufferedReader clientBufferedReader = new BufferedReader(new InputStreamReader(clientInputStream));

            OutputStream serverOutputStream = clientSocket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(serverOutputStream, true);

            String inputLine;

            while ((inputLine = clientBufferedReader.readLine()) != null) {
                System.out.println("client request " + inputLine);

                printWriter.println("server response");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
