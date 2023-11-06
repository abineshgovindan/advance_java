package Advance_Java.Java_IO_Stream_Class.BufferedStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStream_Class {
    public static void main(String[] args) {
       try{
           FileInputStream fin = new FileInputStream("D:\\BSTest.txt");
           BufferedInputStream bin = new BufferedInputStream(fin);
           int i;
           while((i = bin.read()) != -1){
               System.out.print((char) i);

           }
           System.out.println();
           System.out.println("Success");
       }catch (Exception e){
           System.out.println("Err -> " + e);
       }
    }
}
