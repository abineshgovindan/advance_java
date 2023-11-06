package Advance_Java.Java_Networking.Socket;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {
    // initialize socket and input stream
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream in = null;
    public ServerSide(int port) {
        try {
            server = new ServerSocket(port);
            System.out.println("Server started");
            System.out.println("Waiting for a client....");
            socket = server.accept();
            System.out.println("Clinet accepted");
            in = new DataInputStream(
                    new BufferedInputStream(
                            socket.getInputStream()
                    )
            );

            String line = "";
            while (!line.equals("End")) {
                try {
                    line = in.readUTF();
                    System.out.println(line);
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
            System.out.println("Closing connection");
            socket.close();
            in.close();


        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ServerSide server = new ServerSide(5000);

    }



}
