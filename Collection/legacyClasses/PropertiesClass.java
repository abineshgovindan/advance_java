package Advance_Java.Collection.legacyClasses;

import java.util.*;

public class PropertiesClass {
    public static void main(String[] args) {
        Properties pr = new Properties();
        pr.put("Java", "James Ghosling");
        pr.put("C++", "Bjarne Stroustrup");
        pr.put("C", "Dennis Ritchie");
        pr.put("C#", "Microsoft Inc.");
        Set<?>  st = pr.keySet();
        for(Object ob : st){
            System.out.println(ob + " was created "+ pr.getProperty((String) ob));
        }
    }
}
