package Advance_Java.Java_IO_Stream_Class.FileStream_Class;

import java.io.FileOutputStream;

//Java FileOutputStream is an output stream used for writing data to a file.
//
//If you have to write primitive values into a file,
// use FileOutputStream class. You can write byte-oriented
// as well as character-oriented data through FileOutputStream class.
// But, for character-oriented data, it is preferred to use FileWriter
// than FileOutputStream.
public class FileOutputStream_Class {

    public static void WritingChar(){
        //Writing Char
        try{
            FileOutputStream fout = new FileOutputStream("D:\\Test.txt");
            fout.write('A');


            fout.close();
            System.out.println("Success ");

        }catch (Exception e){
            System.out.println("Err -> "+ e);
        }

    }
    public static void WritingString(String str){
        try{
            FileOutputStream fout = new FileOutputStream("D:\\Test2.txt");
            byte[] bt = str.getBytes();//converting string into byte array
            fout.write(bt);
            fout.close();
            System.out.println("Success ");

        }catch (Exception e){
            System.out.println("Err -> "+ e);
        }
    }
    public static void main(String[] args) {
        //WritingChar();
        WritingString("Hello guys");



    }
}
