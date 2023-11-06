package Advance_Java.Java_IO_Stream_Class.ByteArrayStream;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputStream_Class {
    public static void main(String[] args) {
        try{
            FileOutputStream fout1 = new FileOutputStream("D:\\BA\\STest1.txt");
            FileOutputStream fout2 = new FileOutputStream("D:\\BA\\STest2.txt");
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            bout.write(65);
            bout.writeTo(fout1);
            bout.writeTo(fout2);
            bout.flush();
            bout.close();
            System.out.println("Success...");




        }catch (Exception e){
            System.out.println("Err -> "+ e);
        }
    }

}
