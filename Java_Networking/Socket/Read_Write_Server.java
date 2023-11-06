package Advance_Java.Java_Networking.Socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Read_Write_Server {
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream in = null;
    private DataOutputStream out = null;
    private BufferedReader br  = null;

    Read_Write_Server(int port){
        try {
            server = new ServerSocket(port);
            System.out.println("Server started");
            System.out.println("Waiting for a client....");
            socket = server.accept();
            System.out.println("Client accepted");
            in = new DataInputStream(
                    socket.getInputStream()
            );
            out = new DataOutputStream(socket.getOutputStream());
            br = new BufferedReader(new InputStreamReader(System.in));
            String str="",str2="";
            while (!str.equals("End")) {
                try {
                    str = in.readUTF();
                    System.out.println("client says: "+str);
                    str2 = br.readLine();
                    out.writeUTF(str2);
                    out.flush();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
            socket.close();
            in.close();
            out.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        Read_Write_Server server = new Read_Write_Server(5000);
    }


}
