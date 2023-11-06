package Advance_Java.Autoboxing_Unboxing;

import java.util.ArrayList;

//Autoboxing and unboxing that deal with
// conversion of primitive type to object and
// vice versa.
public class Autoboxing {
    //Example: Autoboxing in Collection
    public static void AutoboxingCollection(){
        System.out.println("<---Autoboxing in Collection--->");
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(100);// autoboxing int to Integer
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        for(Integer i : arrayList){
            System.out.println(i);
        }

    }


    public static void main(String[] args) {
        Integer i = 100;// Auto-boxing of int i.e converting primitive data type int to a Wrapper class Integer
        System.out.println(i);

        Character ch = 'a';
        System.out.println(ch);

        Byte b = 12;
        System.out.println(b);

        AutoboxingCollection();
    }
}
