package Advance_Java.Java_IO_Stream_Class.SequenceStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

//Java SequenceInputStream class is used to read data from multiple streams.
// It reads data sequentially (one by one).
public class SequenceInputStream_Class {
    public  static void ReadingMultipleFilesWithEnumeration(){
        try{
            FileInputStream fin1 = new FileInputStream("D:\\Enum\\A.txt");
            FileInputStream fin2 = new FileInputStream("D:\\Enum\\B.txt");
            FileInputStream fin3 = new FileInputStream("D:\\Enum\\C.txt");
            FileInputStream fin4 = new FileInputStream("D:\\Enum\\D.txt");
            FileInputStream fin5 = new FileInputStream("D:\\Enum\\E.txt");
            //creating Vector object to all the stream
            Vector v= new Vector();
            v.add(fin1);
            v.add(fin2);
            v.add(fin3);
            v.add(fin4);
            v.add(fin5);
            //creating enumeration object by calling the elements method
            Enumeration e = v.elements();
            SequenceInputStream sin = new SequenceInputStream(e);
            int i;
            while ((i= sin.read()) != -1){
                System.out.print((char) i);
            }
            sin.close();
            fin1.close();
            fin2.close();
            System.out.println();
            System.out.println("Success...");




        }catch (Exception e){
            System.out.println("Err ->"+ e);
        }
    }
    public static void ReadingFromToTwoFilesAndWritingInOne(){
        try{
            FileInputStream fin1 = new FileInputStream("D:\\BSTest.txt");
            FileInputStream fin2 = new FileInputStream("D:\\Test2.txt");
            FileOutputStream fout = new FileOutputStream("D:\\STest.txt");
            SequenceInputStream sin = new SequenceInputStream(fin1, fin2);
            int i;
            while ((i=sin.read())!=-1){

                System.out.print((char)i);
                fout.write(i);

            }
            fout.close();
            sin.close();
            fin1.close();
            fin2.close();
            System.out.println();
            System.out.println("Success...");


        }catch (Exception e){
            System.out.println("Err -> "+ e);
        }
    }
    public static void main(String[] args) {
        //ReadingFromToTwoFilesAndWritingInOne();
        ReadingMultipleFilesWithEnumeration();

    }
}
