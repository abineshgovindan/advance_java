package Advance_Java.Java_IO_Stream_Class.CharcterStreamClass;

import java.io.FileReader;
import java.io.Reader;

public class Java_Reader {
    public static void main(String[] args) {
        try{
            Reader reader = new FileReader("otext.txt");
            int i = reader.read();
            while (i != -1){
                System.out.print((char)i);
                i = reader.read();

            }
            reader.close();
            System.out.println("Success...");

        }catch (Exception e){
            System.out.println("Err -> "+ e);
        }
    }
}
