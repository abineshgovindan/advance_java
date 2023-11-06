package Advance_Java.Java_IO_Stream_Class.Console_Streams;

import java.io.Console;

public class Console_Class {
    public static void main(String[] args) {
        Console con = System.console();
        System.out.println("Enter your name: ");

        try{
            String str= con.readLine();
            System.out.println("Your is " + str);
        }catch (Exception e){
            System.out.println("Err -> "+ e);
        }


    }
}
