package ru.shemyakin.java.basic.homeworks.homework13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    private static final List<ClientHandler> clientHandlers = new ArrayList<>();

    public static void main(String[] args) {
        try (ServerSocket socket = new ServerSocket(8080)) {
            while (true) {
                Socket clientSocket = socket.accept();
                DataInputStream inputStream = new DataInputStream(clientSocket.getInputStream());
                DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());
                ClientHandler clientHandler = new ClientHandler(clientSocket, inputStream, outputStream);
                clientHandlers.add(clientHandler);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
