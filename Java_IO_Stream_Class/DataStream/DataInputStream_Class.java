package Advance_Java.Java_IO_Stream_Class.DataStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class DataInputStream_Class {
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("D:\\Test2.txt");
            DataInputStream din = new DataInputStream(fin);
            int cnt = din.available();
            byte[] bt = new byte[cnt];
            din.read(bt);
            for(byte b : bt){
                char ch = (char)b;
                System.out.print(ch +" - ");
            }
            System.out.println();
            System.out.println("Size -> "+cnt);
            System.out.println();
            System.out.println("Success...");
        }catch (Exception e){
            System.out.println("Err -> "+ e);
        }
    }
}
