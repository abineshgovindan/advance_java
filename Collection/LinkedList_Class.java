package Advance_Java.Collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_Class<S> {
    public static void main(String[] args) {
        LinkedList<String> str = new LinkedList<String>();
        str.add("AB");
        str.add("EF");
        str.add("CD");
        System.out.println(str);
        //Traversing
        for(String element : str){
            System.out.println( element);
        }
        System.out.println("Total Elements "+ str.size());
        // Sorting elements
        Collections.sort(str);
        System.out.println(str);
        str.addFirst("AA");
        str.addLast("ZZ");
        String s = str.peek();
        System.out.println(s);
        System.out.println(str);

    }
}
