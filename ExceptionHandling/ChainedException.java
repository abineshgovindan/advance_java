package Advance_Java.ExceptionHandling;


import java.io.IOException;

public class ChainedException {
    public static void divide(int a, int b){
        if(b==0){
            ArithmeticException ae = new ArithmeticException("top Layer");
            ae.initCause(new IOException("Cause"));
            throw ae;

        }else {
            System.out.println(a/b);
        }
    }

    public static void main(String[] args) {
        try{
            divide(5,0);
        }catch (ArithmeticException ae){
            System.out.println("caught : "+ ae);
            System.out.println("actual cause: "+ ae.getCause());
        }

        try
        {

            NumberFormatException a = new NumberFormatException("====> Exception");

            a.initCause(new NullPointerException("====> Actual cause of the exception"));

            throw a;
        }

        catch(NumberFormatException a)
        {

            System.out.println(a);
            System.out.println(a.getCause());
        }
    }



}
