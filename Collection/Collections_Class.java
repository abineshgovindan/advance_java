package Advance_Java.Collection;

import java.util.*;

public class Collections_Class {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Adding elements
        list.add(100);
        list.add(2);
        list.add(66);
        list.add(22);
        list.add(10);
        // Displaying list
        System.out.println(list);
        // Sorting list
        Collections.sort(list);
        // Displaying sort data
        System.out.println(list);
        //Finding min and max elements
        int MaxVal = Collections.max(list);
        int MinVal = Collections.min(list);
        System.out.println("The Max Value is -> " + MaxVal +" & "+ "The Min Value is -> "+  MinVal);
        // Swapping elements

        Collections.swap(list, 0,4);
        System.out.println(list);
        // Reverse the list
        Collections.reverse(list);
        System.out.println(list);
    }
}
