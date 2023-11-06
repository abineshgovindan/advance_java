package Advance_Java.Collection;
//ArrayList()  // It creates an empty ArrayList
//ArrayList( Collection C ) // It creates an ArrayList that is initialized with elements of the Collection C
//ArrayList( int capacity ) // It creates an ArrayList that has the specified initial capacity

import java.util.*;

public class ArrayList_Class {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<String>();
        str.add("AB");
        str.add("CD");
        str.add("EF");
        System.out.println(str);
        System.out.println("Iterator ");
        Iterator itr = str.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        //ListIterator Interface is used to traverse a list in both forward and backward direction
        System.out.println("ListIterator");
        ListIterator fitr = str.listIterator();
        System.out.println("ListIterator forward direction");
        //In forward direction
        while (fitr.hasNext()){
            System.out.println(fitr.next());
        }
        //In backward direction

        System.out.println("ListIterator backward direction");
        while (fitr.hasPrevious()){
            System.out.println(fitr.previous());
        }


        System.out.println("for-each loop");

        for (String st : str){
            System.out.println(st);
        }


        System.out.println("for loop");
        for(int i=0; i < str.size(); i++){
            System.out.println("val -> "+ str.get(i));
        }
        str.remove("CD");
        System.out.println("Remove function");
        System.out.println("After Deleting Elements: \n");
        System.out.println(str);
        System.out.println("Remove All");
        str.clear();
        System.out.println("Adding new elements");
        str.add("Mango");
        str.add("Apple");
        str.add("Berry");
        str.add("Orange");
        System.out.println(str);
        System.out.println("Sorting elements");
        Collections.sort(str);
        System.out.println(str);





//https://www.studytonight.com/java/iterator-in-collection.php
    }
}
