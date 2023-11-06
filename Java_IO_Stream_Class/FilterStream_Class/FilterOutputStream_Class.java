package Advance_Java.Java_IO_Stream_Class.FilterStream_Class;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;

public class FilterOutputStream_Class {
    public static void main(String[] args) {
        try{
            File file = new File("D:\\FData.txt");
            FileOutputStream fout = new FileOutputStream(file);
            FilterOutputStream fouts = new FilterOutputStream(fout);
            String str = "Hello Guys!";
            byte[] bt = str.getBytes();
            fouts.write(bt);
            fouts.flush();
            fouts.close();
            fout.close();
            System.out.println("Success...");


        } catch (Exception e) {
            System.out.println("Err ->" +e);
        }
    }
}
