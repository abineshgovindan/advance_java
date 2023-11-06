package Advance_Java.Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Class {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("AB");
        ts.add("CD");
        ts.add("EF");
        ts.add("GH");
        ts.add("CD");
        ts.add("AB");
        System.out.println(ts);
        Iterator itr = ts.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}
