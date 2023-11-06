package Advance_Java.Collection.legacyClasses;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_Class {
    public static void main(String[] args) {
        Vector<Integer> ve = new Vector<Integer>();
        ve.add(10);
        ve.add(20);
        ve.add(30);
        ve.add(40);
        ve.add(50);
        ve.add(60);
        System.out.println(ve);
        Enumeration en = ve.elements();
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }
}
