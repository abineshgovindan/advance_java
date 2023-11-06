package Advance_Java.Java_IO_Stream_Class.CharcterStreamClass.CharArray;

import java.io.CharArrayReader;

public class CharArrayReader_Class {
    public static void main(String[] args) {
    try{
        char[] arr = {'A', 'B',  'C', 'D', 'E', 'F',  'G',  'H',  'I'};
        CharArrayReader car = new CharArrayReader(arr);
        int i = 0;
        System.out.println("Byte :   Char");
        while ((i= car.read())!= -1){
            char ch = (char)i;

            System.out.print( i + "   :    " + ch);
            System.out.println();

        }

    }catch (Exception e){
        System.out.println("Err -> "+ e);
    }

    }
}
