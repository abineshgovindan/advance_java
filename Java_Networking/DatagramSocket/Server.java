package Advance_Java.Java_Networking.DatagramSocket;

import java.net.*;

public class Server {
    private DatagramSocket dSocket= null;
    private InetAddress ip = null;
    private DatagramPacket dp = null;
    Server() throws SocketException {
         dSocket = new DatagramSocket();
        System.out.println("server connected");
    }
    private void SendingServic(String str) throws Exception {
         ip = InetAddress.getByName("127.0.0.1");
         dp = new DatagramPacket(str.getBytes(), str.length(),ip, 3000);
         dSocket.send(dp);
         dSocket.close();
    }

    public static void main(String[] args)throws Exception {
        Server obj = new Server();
        obj.SendingServic("Hello Guys!");

    }
}
