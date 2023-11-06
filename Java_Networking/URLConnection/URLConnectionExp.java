package Advance_Java.Java_Networking.URLConnection;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionExp {
    public static void main(String[] args) throws MalformedURLException {
        try{
            URL url = new URL("http://www.javatpoint.com/java-tutorial");
            URLConnection urlcon = url.openConnection();
            InputStream in = urlcon.getInputStream();
            int i;
            while ((i = in.read())!=-1){
                System.out.println((char)i);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
