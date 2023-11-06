package Advance_Java.Java_IO_Stream_Class.BufferedStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStream_Class {
    public static void main(String[] args) {
       try{
           FileOutputStream fout = new FileOutputStream("D:\\BSTest.txt");
           BufferedOutputStream bout = new BufferedOutputStream(fout);
           String str = "Hello Guys, BufferedOutputStream Example";
           byte[] bt = str.getBytes();
           bout.flush();
           bout.write(bt);
           bout.flush();
           bout.close();
           fout.close();
           System.out.println("success");
       }catch (Exception e){
           System.out.println("Err-> "+ e);
       }
    }
}
