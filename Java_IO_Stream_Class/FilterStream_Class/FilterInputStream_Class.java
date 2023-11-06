package Advance_Java.Java_IO_Stream_Class.FilterStream_Class;

import java.io.*;

public class FilterInputStream_Class {
    public static void main(String[] args) {
        try{
            File file = new File("D:\\FData.txt");
            FileInputStream fin  = new FileInputStream(file);
            FilterInputStream filter = new BufferedInputStream(fin);
            int i =0;
            while((i = filter.read()) != -1){
                System.out.print((char)i);
            }
            filter.close();
            fin.close();
            System.out.println();
            System.out.println("Success...");


        }catch (Exception e){
            System.out.println("Err ->"+ e);
        }
    }
}
