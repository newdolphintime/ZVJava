package com.zvi.study.Socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Zv on 2017/03/31.
 */
public class SocketServer {
    public static void main(String[] args) {
        int port = 7000 ;
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            Socket socket = serverSocket.accept();
            DataInputStream dataInputStream =new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
            do{
                double length =dataInputStream.readDouble();
                System.out.println("服务器端收到的边长数据为：" + length);
                double result = length * length;
                dataOutputStream.writeDouble(result);
                dataOutputStream.flush();
            }while(dataInputStream.readInt()!=0);
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
