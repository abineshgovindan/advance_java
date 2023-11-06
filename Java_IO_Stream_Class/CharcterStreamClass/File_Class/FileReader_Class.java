package Advance_Java.Java_IO_Stream_Class.CharcterStreamClass.File_Class;

import java.io.FileReader;

public class FileReader_Class {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("OP.txt");
            int i=0;
            while ((i= fr.read())!= -1){
                System.out.print((char) i);
            }
            System.out.println();
            System.out.println("Success...");
        }catch (Exception e){
            System.out.println("Success ->"+ e);
        }
    }
}
