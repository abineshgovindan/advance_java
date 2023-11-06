package Advance_Java.Java_IO_Stream_Class.CharcterStreamClass.BufferedClass;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Vector;

public class BufferedReader_Class {
    public static void ReadingDataMultipleLineFromConsole(){
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String  name = "";
            Vector<String> v = new Vector();
            int i = 0;
            System.out.println("Enter the Name list");
            while (!name.equals("s")){
                System.out.println("------------------");
                name = br.readLine();
                i++;
                v.add(i+ " : "+ name);
            }
            br.close();
            isr.close();
            System.out.println(v);
            for (String st : v){
                System.out.println(st);
            }
            System.out.println("Success");

        }catch (Exception e){
            System.out.println("Err -> "+ e);
        }
    }

    public static void ReadingDataFromConsole(){
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            System.out.println("Enter your name");
            String name = br.readLine();
            System.out.println("Welcome "+name);


        }catch (Exception e){
            System.out.println("Err -> "+ e);
        }
    }
    public  static void fileReader(){
        try{
            FileReader fr = new FileReader("FW.txt");
            BufferedReader br = new BufferedReader(fr);
            int i=0;
            while((i= br.read())!= -1){
                System.out.print((char)i);
            }
            System.out.println();
            System.out.println("Success...");

        }catch (Exception e){
            System.out.println("Err -> "+ e);
        }

    }
    public static void main(String[] args) {
        //fileReader();
        //ReadingDataFromConsole();
        ReadingDataMultipleLineFromConsole();
    }
}
