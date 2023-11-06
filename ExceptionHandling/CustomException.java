package Advance_Java.ExceptionHandling;

class MyException extends Exception{
    private int ex;
    MyException(int a){
        ex = a;
    }
    public String toString(){
        return "MyException [" + ex + "] is less than zero";
    }
}

class ItemNotFound extends Exception
{
    public ItemNotFound(String s) {
        super(s);
    }

}

public class CustomException {
    public static void Demo(int a, int b) throws MyException{
        if(a<0){
            throw new MyException(a);
        }
        else System.out.println("Total -> "+ a+b);
    }

    static void find(int arr[], int item) throws ItemNotFound
    {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(item == arr[i])
                flag = true;
        }
        if(!flag)
        {
            throw new ItemNotFound("Item Not Found"); //calling constructor of user-defined exception class
        }
        else
        {
            System.out.println("Item Found");
        }
    }

    public static void main(String[] args) {
        try{
            Demo(-10, 1);
        } catch (MyException e) {
            System.out.println(e);
        }


        try
        {
            find(new int[]{12,25,45}, 10);
        }
        catch(ItemNotFound i)
        {
            System.out.println(i);
        }


    }

}
