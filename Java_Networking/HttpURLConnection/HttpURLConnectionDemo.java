package Advance_Java.Java_Networking.HttpURLConnection;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpURLConnectionDemo {
    private URL url = null;
    HttpURLConnectionDemo(String getUrl) throws MalformedURLException {
        try{
            url = new URL(getUrl);
            HttpURLConnection req = (HttpURLConnection) url.openConnection();
            for(int i =0; i< 8; i++){
                System.out.println(req.getHeaderField(i) + " = " + req.getHeaderFieldKey(i));
            }
            req.disconnect();


        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void main(String[] args) throws MalformedURLException {
        HttpURLConnectionDemo httpObj = new HttpURLConnectionDemo(
                "https://www.studytonight.com/java/");
    }
}
