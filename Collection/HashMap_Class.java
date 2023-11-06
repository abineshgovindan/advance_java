package Advance_Java.Collection;


import java.util.*;
public class HashMap_Class {
    public static void main(String[] args) {
        HashMap<String, Integer> hmp = new HashMap<String, Integer>();
        hmp.put("AAAA", 1);
        hmp.put("BBBB", 2);
        hmp.put("CCCC", 3);
        hmp.put("DDDD", 4);
        Set<Map.Entry<String, Integer>> st = hmp.entrySet();
        System.out.println("----------------");
        System.out.println("| Key  | Value |");

        for(Map.Entry<String, Integer> me: st){
            System.out.print("| " + me.getKey() );
            System.out.println(" :   " + me.getValue()+"   |");

        }
        System.out.println("----------------");

        System.out.println(hmp);
        // Remove element by key
        hmp.remove("CCCC");
        System.out.println("After Removing 2 :\n"+ hmp);
        // Traversing HashMap
        for(Map.Entry<String, Integer> mp : hmp.entrySet()){
            System.out.println(new StringBuilder().append(mp.getKey()).append(" : ").append(mp.getValue()).toString());
        }
        // Replacing Elements of HashMap
        hmp.replace("AAAA", 01);
        System.out.println(hmp);



    }
}
