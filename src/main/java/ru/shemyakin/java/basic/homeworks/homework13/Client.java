package ru.shemyakin.java.basic.homeworks.homework13;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Socket socket = new Socket("localhost", 8080);
            NetClient client = new NetClient(socket.getInputStream(), socket.getOutputStream());
            while (true) {
                String message = client.get();
                System.out.println(message);
                String userText;
                if (!message.contains("Результат")) {
                    userText = scanner.nextLine();
                    if (userText.equals("exit")) {
                        break;
                    }
                    client.send(userText);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
