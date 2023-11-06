package Advance_Java.Autoboxing_Unboxing;

import java.util.ArrayList;

public class Unboxing {

//    Primitive	Wrapper class
//    int	Integer
//    byte	Byte
//    short	Short
//    float	Float
//    double	Double
//    char	Character
//    long	Long
//    boolean	Boolean

    public static void UnboxingCollection(){
        System.out.println("<---Unboxing in Collection--->");
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(100);// autoboxing int to Integer
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        for(Integer i : arrayList){
            System.out.println(i);
        }
        // unboxing Integer to int type

        int firstEle = arrayList.get(0);
        System.out.println("int value -> "+ firstEle);



    }
    public static void main(String[] args) {

        UnboxingCollection();

        Integer i = 35;
        Double d = 33.3;
        d = d + i;
        System.out.println("Value of d is " + d);

    }
}
