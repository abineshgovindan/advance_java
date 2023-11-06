package Advance_Java.Java_Networking.HttpURLConnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetMethode {
    private static  final String USER_AGENT  = "Mozilla/5.0" ;

    GetMethode() {
        System.out.println("Object Initialized ");
    }
    private String GetRequest(String url) throws IOException {
        URL obj = new URL(url);
        HttpURLConnection requstObj = (HttpURLConnection) obj.openConnection();
        requstObj.setRequestMethod("GET");
        requstObj.setRequestProperty("User-Agent", USER_AGENT);
        int resCode = requstObj.getResponseCode();
        System.out.println("GET Response Code :: " + resCode);
        if(resCode == HttpURLConnection.HTTP_OK){//success
            BufferedReader in = new BufferedReader(new InputStreamReader( requstObj.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine())!= null){
                response.append(inputLine);
            }
            in.close();
            return response.toString();
        }else {
            System.out.println("GET request did not work.");
        }
        return "GET request did not work.";


    }

    public static void main(String[] args) throws IOException {
        GetMethode request = new GetMethode();
        String responce = request.GetRequest("https://reqres.in/api/users?page=1");
        System.out.println(responce);

    }

}
