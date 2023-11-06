package Advance_Java.Java_Networking.URLClass;

import java.net.MalformedURLException;
import java.net.URL;

public class URLclassExample1 {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL(
                "https://write.geeksforgeeks.org/post/3038131"
        );
        String s = url.toString();
        System.out.println("URL : "+ s);
        System.out.println(url.getHost());
        // to get and print the protocol of the URL
        String protocol = url.getProtocol();

        System.out.println("Protocol : " + protocol);
        // to get and print the hostName of the URL
        String host = url.getHost();

        System.out.println("HostName : " + host);

        // to get and print the file name of the URL
        String fileName = url.getFile();

        System.out.println("File Name : " + fileName);
        // to get and print the default port of the URL
        int defultPort = url.getDefaultPort();
        System.out.println("Default Port : "+ defultPort);

        // to get and print the path of the URL
        String path = url.getPath();

        System.out.println("Path : " + path);
    }
}
