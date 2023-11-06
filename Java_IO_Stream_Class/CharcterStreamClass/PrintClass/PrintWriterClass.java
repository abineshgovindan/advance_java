package Advance_Java.Java_IO_Stream_Class.CharcterStreamClass.PrintClass;

import java.io.File;
import java.io.PrintWriter;

public class PrintWriterClass {
    public static void main(String[] args) {
        try{
            PrintWriter pw = new PrintWriter(System.out);
            pw.write("Hello Guys!");
            pw.flush();
            pw.close();
            //Data to write in File using PrintWriter
            PrintWriter pw1 = null;
            pw1 = new PrintWriter(new File("Hello.txt"));
            pw1.print("Hello Guys!");
            pw1.flush();
            pw1.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
