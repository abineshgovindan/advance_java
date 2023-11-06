package Advance_Java.Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue_Class {
    public static void main(String[] args) {
        PriorityQueue<String> ps = new PriorityQueue<String>();
        ps.add("AB");
        ps.add("CD");
        ps.add("EF");
        ps.add("GH");
        System.out.println("At head of the queue:"+ ps.element());
        System.out.println("At head of the queue:"+ ps.peek());
        System.out.println("Iterating the queue elements:");
        Iterator itr = ps.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Removed");
        ps.remove();
        ps.poll();
        Iterator itr2 = ps.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }

    }
}
