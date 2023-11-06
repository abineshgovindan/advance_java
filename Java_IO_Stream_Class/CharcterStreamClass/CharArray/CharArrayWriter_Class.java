package Advance_Java.Java_IO_Stream_Class.CharcterStreamClass.CharArray;

import java.io.CharArrayWriter;
import java.io.FileWriter;

public class CharArrayWriter_Class {
    public static void main(String[] args) {
        String str = "Hello Guys!";
        try{
            FileWriter fw1 = new FileWriter("A.txt");
            FileWriter fw2 = new FileWriter("B.txt");
            FileWriter fw3 = new FileWriter("C.txt");
            FileWriter fw4 = new FileWriter("D.txt");
            FileWriter fw5 = new FileWriter("E.txt");
            CharArrayWriter  caout = new CharArrayWriter();
             caout.write(str);
             caout.writeTo(fw1);
             caout.writeTo(fw2);
             caout.writeTo(fw3);
             caout.writeTo(fw4);
             caout.writeTo(fw5);
             fw1.close();
             fw2.close();
             fw3.close();
             fw4.close();
             fw5.close();
             System.out.println("Success");



        }catch (Exception e){
            System.out.println("Err ->" + e);
        }



    }
}
