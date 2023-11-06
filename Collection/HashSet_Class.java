package Advance_Java.Collection;

import java.util.HashSet;
//HashSet does not maintain any order of elements.
//HashSet contains only unique elements.
public class HashSet_Class {
    public static void main(String args[])
    {
        HashSet<String> hs = new HashSet<String>();
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("A");
        System.out.println(hs);
        for(String element : hs) {
            System.out.println(element);
        }
    }
}
