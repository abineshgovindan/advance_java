package Advance_Java.Java_Networking.Socket;

import java.io.*;
import java.net.Socket;

public class Read_Write_Clinet {

    private Socket socket = null;

    private DataInputStream in = null;
    private DataOutputStream out = null;
    private BufferedReader br  = null;

    Read_Write_Clinet(String address, int port){
        try {
            socket = new Socket(address,port);
            System.out.println("Client started");
            System.out.println("Connected");

            in = new DataInputStream(
                    socket.getInputStream()
            );
            out = new DataOutputStream(socket.getOutputStream());
            br = new BufferedReader(new InputStreamReader(System.in));
            String str="",str2="";
            while (!str.equals("End")) {
                try {
                    str = br.readLine();
                    out.writeUTF(str);
                    out.flush();

                    str2 = in.readUTF();
                    System.out.println("Server says: "+str2);



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
        Read_Write_Clinet Clinet = new Read_Write_Clinet("127.0.0.1",5000);
    }

}
