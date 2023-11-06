package Advance_Java.Java_IO_Stream_Class.DataStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStream_Class {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("D:\\DOText.txt");
            DataOutputStream dout = new DataOutputStream(fout);
            dout.writeInt(65);
            dout.flush();
            dout.close();
            fout.close();
            System.out.println("Success...");

        }catch (Exception e){
            System.out.println("Err ->"+ e);
        }

    }
}
