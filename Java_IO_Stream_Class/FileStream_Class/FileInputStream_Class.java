package Advance_Java.Java_IO_Stream_Class.FileStream_Class;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class FileInputStream_Class {
    public static void ReadingChar(){
        try{
            FileInputStream fin = new FileInputStream("D:\\Test.txt");
            int i = fin.read();
            System.out.println((char)i);
        }catch (Exception e){
            System.out.println("Err -> "+ e);
        }
    }
    public static void ReadingString(){
        try{
            FileInputStream fin = new FileInputStream("D:\\Test2.txt");
            int i;
            while((i= fin.read()) != -1){
                System.out.print((char) i);

            };
            fin.close();
            System.out.println();
            System.out.println("Success ");

        }catch (Exception e){
            System.out.println("Err -> "+ e);
        }
    }

    public static void main(String[] args) {
        //ReadingChar();
        ReadingString();

    }
}
