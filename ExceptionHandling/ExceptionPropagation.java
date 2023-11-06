package Advance_Java.ExceptionHandling;

import java.io.IOException;

class ExpDemo{
    void a1(){
        int data = 30/0;
    }
    void a2(){
        a1();
    }
    void a3(){
        try {
            a2();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
public class ExceptionPropagation {
    void m1() throws IOException
    {
        throw new IOException("device error");
    }
    void n1() throws IOException
    {
        m1();
    }
    void p1()
    {
        try {
            n1();
        }
        catch (Exception e)
        {
            System.out.println("Exception handled " + e);
        }
    }

    public static void main(String[] args) {
//        ExpDemo obj = new ExpDemo();
//        obj.a3();
        ExceptionPropagation obj = new ExceptionPropagation();
        obj.p1();
    }
}
