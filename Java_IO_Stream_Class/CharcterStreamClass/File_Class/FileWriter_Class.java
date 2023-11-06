package Advance_Java.Java_IO_Stream_Class.CharcterStreamClass.File_Class;

import java.io.FileWriter;

public class FileWriter_Class {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("OP.txt");
            fw.write("Hello Guys!");
            fw.close();
            System.out.println("Success...");
        }catch (Exception e){
            System.out.println("Err ->" + e);
        }



    }
}
