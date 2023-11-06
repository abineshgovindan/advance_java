package Advance_Java.Collection.legacyClasses;

import java.util.*;

public class HashtableClass {
    public static void main(String[] args) {
        Hashtable<String,Integer> ht = new Hashtable<String,Integer>();
        ht.put("a", (100));
        ht.put("b", (200));
        ht.put("c", (300));
        ht.put("d", (400));
        System.out.println(ht);
        Set st= ht.entrySet();
        Iterator itr = st.iterator();
        while (itr.hasNext()){
            Map.Entry m = (Map.Entry)itr.next();
            System.out.println(m.getKey() + " : " + m.getValue());
        }
    }
}
