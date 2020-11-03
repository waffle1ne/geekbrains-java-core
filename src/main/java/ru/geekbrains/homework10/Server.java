package ru.geekbrains.homework10;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private final ServerSocket serverSocket;
    private final Socket socket;
    private final DataInputStream in;
    private final DataOutputStream out;

    public Server(int socketNum) throws IOException {
        serverSocket = new ServerSocket(socketNum);
        System.out.println("Сервер запущен...");
        socket = serverSocket.accept();
        System.out.println("Клиент подключился");
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
        while (true) {
            String str = in.readUTF();
            if (str.equals("/end")) {
                out.writeUTF("Сервер отключён");
                break;
            }
            out.writeUTF("Вы: " + str + "\n" + "Эхо: " + str);
        }
    }
}
