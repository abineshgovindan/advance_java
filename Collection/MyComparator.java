package Advance_Java.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class MyComparator {
    public static void main(String[] args) {
        TreeSet< Student> st = new TreeSet<Student>(new Comparator_Interface());
        st.add(new Student(45, "AB"));
        st.add(new Student(55, "BC"));
        st.add(new Student(11, "TT"));
        st.add(new Student(11, "TT"));
        st.add(new Student(22, "HH"));
        System.out.println(st);

        ArrayList< Student> ts = new ArrayList<Student>();
        ts.add(new Student(45, "Rahul"));
        ts.add(new Student(11, "Adam"));
        ts.add(new Student(19, "Alex"));
        Collections.sort(ts, new Comparator_Interface());/*passing the name of the ArrayList and the
object of the class that implements Comparator in a predefined sort() method in Collections
class*/
        System.out.println(ts);
    }
}
