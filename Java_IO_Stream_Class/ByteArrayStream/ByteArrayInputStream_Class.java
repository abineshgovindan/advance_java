package Advance_Java.Java_IO_Stream_Class.ByteArrayStream;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStream_Class {
    public static void main(String[] args) {
        try{
            byte[] bt = {10, 20, 30, 40, 50};
            ByteArrayInputStream bin = new ByteArrayInputStream(bt);
            int i =0 ;
            while((i= bin.read())!=-1){
                char ch = (char) i;
                System.out.println("ASCII value of Character is:" + i + "; Special character is: " + ch);
            }


        }catch (Exception e){
            System.out.println("Err -> "+ e);
        }
    }

}
