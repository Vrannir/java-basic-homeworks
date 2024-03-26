package ru.shemyakin.java.basic.homeworks.homework13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientHandler {
    private final Socket clientSocket;
    private final DataInputStream inputStream;
    private final DataOutputStream outputStream;

    public ClientHandler(Socket clientSocket, DataInputStream inputStream, DataOutputStream outputStream) {
        this.clientSocket = clientSocket;
        this.inputStream = inputStream;
        this.outputStream = outputStream;
        new Thread(() -> {
            try {
                while (true) {
                    outputStream.writeUTF("Введите операцию (+,-,*,/):");
                    outputStream.flush();
                    String operation = inputStream.readUTF();
                    System.out.println("op: " + operation);

                    outputStream.writeUTF("Введите 1 операнд:");
                    outputStream.flush();
                    String operand1 = inputStream.readUTF();
                    System.out.println("v1: " + operand1);

                    outputStream.writeUTF("Введите 2 операнд:");
                    outputStream.flush();
                    String operand2 = inputStream.readUTF();
                    System.out.println("v2: " + operand2);

                    String result = calculate(operation, operand1, operand2);
                    outputStream.writeUTF("Результат: " + result);
                    outputStream.flush();

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }

    private static String calculate(String operation, String operand1, String operand2) throws IOException {
        Integer v1 = Integer.valueOf(operand1);
        Integer v2 = Integer.valueOf(operand2);
        Integer result;
        switch (operation) {
            case ("+"):
                result = v1 + v2;
                break;
            case ("-"):
                result = v1 - v2;
                break;
            case ("*"):
                result = v1 * v2;
                break;
            default:
                result = v1 / v2;
                break;
        }
        return String.valueOf(result);
    }
}
