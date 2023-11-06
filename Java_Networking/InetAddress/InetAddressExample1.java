package Advance_Java.Java_Networking.InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample1 {
        public static void main(String[] args) throws UnknownHostException {
            // To get and print InetAddress of the Local Host
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("InetAdress of the Local Host : " + address);
            // To get and print Inet Name of the Local Host
            String hostName = address.getHostName();
            System.out.println("\nHost name of the Local Host : " + hostName);

            // To get and print InetAddress of Named Hosts
            InetAddress address1 = InetAddress.getByName(
                    "write.geeksforgeeks.org");

            System.out.println("Inet Address of named hosts : "
                    + address1);

            // To get and print ALL InetAddress of Named Host
            InetAddress arr[] = InetAddress.getAllByName(
                    "www.geeksforgeeks.org");
            System.out.println("\nInet Address of ALL named hosts :");
            for (int i = 0; i < arr.length; i++) {

                System.out.println(arr[i]);
            }


        }
}
