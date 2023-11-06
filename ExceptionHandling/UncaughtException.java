package Advance_Java.ExceptionHandling;

public class UncaughtException {
    public static void main(String[] args) {
//        int a = 0;
//        int b = 7/a;

        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at ExceptionHandling.UncaughtException.main(UncaughtException.java:6)

        try{
            int a = 0;
            int b = 7;
            int r = b/a;
            System.out.println("This line will not be executed");
        } catch (ArithmeticException e) { //Exception e//java.lang.ArithmeticException: / by zero

            System.out.println(e); //java.lang.ArithmeticException: / by zero
        }
        System.out.println("This line will  be executed");

//        try
//        {
//            Integer in = new Integer("abc");
//            in.intValue();
//
//        }
//        catch (ArithmeticException e)
//        {
//            System.out.println("Arithmetic " + e);
//        }
//        catch (NumberFormatException e)
//        {
//            System.out.println("Number Format Exception " + e);
//        }
//
//        try
//        {
//            int arr[]={1,2};
//            arr[2]=3/0;
//        }
//        catch(Exception e)    //This block handles all Exception
//        {
//            System.out.println("Generic exception");
//        }
//        catch(ArrayIndexOutOfBoundsException e)    //This block is unreachable
//        {
//            System.out.println("array index out of bound exception");
//        }

    }
}
