package com.socket;

import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            out.println("Hello Server!");

            System.out.println("Message sent to server");

            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}