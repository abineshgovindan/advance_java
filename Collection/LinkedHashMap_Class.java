package Advance_Java.Collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap_Class {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
        lhm.put("a",100);
        lhm.put("b",200);
        lhm.put("c",300);
        lhm.put("d",400);
        Set<Map.Entry<String, Integer>> st = lhm.entrySet();
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
