package Advance_Java.Java_IO_Stream_Class.Console_Streams;

import java.io.IOException;

public class Standard_Input_Stream {
    public static void main(String[] args) throws IOException {
        int i = System.in.read();
        System.out.println((char)i);
    }
}
