package Advance_Java.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryResourceStatement {
    public static void main(String[] args) {
        //Without Resource Statement you have to close() the resource , but it will not executed
//        try {
//            String str;
//            //opening file in read mode using BufferedReader stream
//            BufferedReader br = new BufferedReader(new FileReader("d:\\myfile.txt"));
//            while((str=br.readLine())!=null)
//            {
//                System.out.println(str);
//            }
//            br.close();     //closing BufferedReader stream
//        }
//        catch(IOException ie)
//        {
//            System.out.println("I/O Exception "+ie);
//        }

        try (BufferedReader br = new BufferedReader(new FileReader("d:\\myfile.txt"));)
        {
            String str;
            //opening file in read mode using BufferedReader stream

            while((str=br.readLine())!=null)
            {
                System.out.println(str);
            }

        }
        catch(IOException ie)
        {
            System.out.println("I/O Exception "+ie);
        }
    }
}
