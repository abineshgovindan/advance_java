package Advance_Java.Java_Networking.DatagramSocket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Client {
    private DatagramSocket dSocket= null;
    private byte[] buf = null;
    private DatagramPacket dp = null;
    Client() throws Exception {
        dSocket = new DatagramSocket(3000);
        buf =new byte[1024];
        dp = new DatagramPacket(buf, 1024);
        dSocket.receive(dp);
        String str  = new String(dp.getData(),0,dp.getLength());
        System.out.println(str);
        dSocket.close();



    }

    public static void main(String[] args) throws Exception {
        Client client = new Client();
    }
}
