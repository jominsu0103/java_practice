package Lectures.week1.training1.chapter_57;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 1234)) {
            OutputStream outputStream = socket.getOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            Customer customer = new Customer("ID112", "lee");
            objectOutputStream.writeObject(customer);
            objectOutputStream.flush();

            String response = bufferedReader.readLine();
            System.out.println("server response(customer waitingList) : " + response);

            System.out.println("client close");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
