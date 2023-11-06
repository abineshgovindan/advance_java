package Advance_Java.Collection;

import java.util.LinkedHashSet;

public class LinkedHashSet_Class {
    public static void main(String args[])
    {
        LinkedHashSet<String> hs = new LinkedHashSet<String>();
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("F");
        System.out.println(hs);

        // Traversing ArrayList
        for(String element : hs) {
            System.out.println(element);
        }
        System.out.println("Total elements : "+hs.size());
    }
}
