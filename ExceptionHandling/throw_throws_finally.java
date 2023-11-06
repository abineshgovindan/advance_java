package Advance_Java.ExceptionHandling;

public class throw_throws_finally {
    public static void ThrowKey(){
        //Throw
        int a = 0;
        int b = 7;
        try{


            throw new ArithmeticException();

        }catch (ArithmeticException e){
            System.out.println(e);
        }

    }
    static void check() throws ArithmeticException
    {
        System.out.println("Inside check function");
        throw new ArithmeticException("demo");
    }

    public static void ThrowsKey() {
       try {
           check();
       }catch (ArithmeticException e){
           System.out.println("caught " + e);
       }
    }

    public static void Finally(){
        int a[] = new int[2];
        System.out.println("out of try");
        try
        {
            System.out.println("Access invalid element"+ a[3]);
            /* the above statement will throw ArrayIndexOutOfBoundException */
        }
        finally
        {
            System.out.println("finally is always executed.");
        }
    }
    public static void main(String[] args) {
      // ThrowKey();
        // ThrowsKey();
        Finally();



    }
}
