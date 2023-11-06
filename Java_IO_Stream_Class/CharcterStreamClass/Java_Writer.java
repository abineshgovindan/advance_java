package Advance_Java.Java_IO_Stream_Class.CharcterStreamClass;

import java.io.FileWriter;
import java.io.Writer;

public class Java_Writer {
    public static void main(String[] args) {
        try{
            Writer w = new FileWriter("otext.txt");
            String cnt = "Hello Guys!";
            w.write(cnt);
            w.close();
            System.out.println("Success...");

        }catch (Exception e){
            System.out.println("Err -> "+ e);
        }
    }
}
