package Lectures.week1.training1.chapter_59;

import Lectures.week1.training1.chapter_57.Customer;

import java.io.*;
import java.net.Socket;
import java.util.List;

public class RequestHandler implements Runnable {
    private Socket clientSocket;
    private List<Customer> customerList;

    public RequestHandler(Socket clientSocket, List<Customer> customerList) {
        this.clientSocket = clientSocket;
        this.customerList = customerList;
    }

    @Override
    public void run() {
        try {
            System.out.println("client linked start");

            // 클라이언트로부터 데이터를 받기 위한 InputStream 생성
            InputStream clientInputStream = clientSocket.getInputStream();
            ObjectInputStream objectInputStream = new ObjectInputStream(clientInputStream);

            // 클라이언트로 데이터를 보내기 위한 OutputStream 생성
            OutputStream serverOutputStream = clientSocket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(serverOutputStream, true);

            Customer customer = (Customer) objectInputStream.readObject();

            ListUtils.addList(customerList, customer);

            System.out.println("Thread " + Thread.currentThread().getName() + ": " + customer + "가 대기명단에 추가되었습니다.");
            printWriter.println("고객 대기명단 : " + customerList);

            printWriter.println("server response");

            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
