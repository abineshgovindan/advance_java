package Advance_Java.Java_IO_Stream_Class.CharcterStreamClass.PrintClass;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStream_Class {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("Text.txt");
            PrintStream pout = new PrintStream(fos);
            pout.println("Abinesh");
            pout.println(23);
            pout.println(2000);
            pout.close();
            fos.close();
            System.out.println("Success");

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
