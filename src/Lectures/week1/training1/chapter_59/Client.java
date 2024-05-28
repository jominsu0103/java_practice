package Lectures.week1.training1.chapter_59;

import Lectures.week1.training1.chapter_57.Customer;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 1234)) { //서번 연결
            // 서버로 데이터를 보내기 위한 OutputStream 생성
            OutputStream outputStream = socket.getOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            // 서버로부터 데이터를 받기 위한 InputStream 생성
            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            Customer customer = new Customer("ID114", "kim");
            // 서버에 메세지 전송
            objectOutputStream.writeObject(customer);
            objectOutputStream.flush();

            // 서버로부터 받은 응답 출력
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
