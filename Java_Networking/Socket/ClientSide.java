package Advance_Java.Java_Networking.Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSide {
    // initialize socket and input output streams
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream out = null;
    public ClientSide(String address, int port){
        try{
            // establish a connection
            socket =  new Socket(address, port);
            System.out.println("Connected");
            //takes inputs from terminal
            input = new DataInputStream(System.in);
            out = new DataOutputStream(socket.getOutputStream());

        } catch (UnknownHostException u) {
            System.out.println(u);
        } catch (IOException e) {
            System.out.println(e);
        }
        // string to read message from input
        String line ="";
        // keep reading until "End" is input
        while (!line.equals("End")){
            try{
                line = input.readLine();
                out.writeUTF(line);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        // close the connection
        try{
            input.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        ClientSide client = new ClientSide("127.0.0.1",5000);
    }

}
