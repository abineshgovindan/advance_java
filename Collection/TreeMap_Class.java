package Advance_Java.Collection;

import java.util.*;

public class TreeMap_Class {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm = new TreeMap<String, Integer>();
        tm.put("a",100);
        tm.put("b",200);
        tm.put("c",300);
        tm.put("d",400);
        Set<Map.Entry<String, Integer>> st = tm.entrySet();
        System.out.println("TreeMap_Class");
        System.out.println("----------------");
        System.out.println("| Key  | Value |");
        for(Map.Entry<String, Integer> mp : st){
            System.out.print("| " + mp.getKey() );
            System.out.println("    :  " + mp.getValue()+"  |");


        }
        System.out.println("----------------");
    }
}
