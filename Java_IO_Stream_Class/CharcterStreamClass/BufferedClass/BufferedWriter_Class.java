package Advance_Java.Java_IO_Stream_Class.CharcterStreamClass.BufferedClass;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriter_Class {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("FW.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hello Guys!");
            bw.close();
            System.out.println("Success");
        }catch (Exception e){
            System.out.println("Err -> "+ e);
        }
    }
}
