package Advance_Java.Collection;

import java.util.Comparator;

public class Comparator_Interface implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if(s1.roll == s2.roll) return 0 ;
        else if(s1.roll > s2.roll) return 1;
        else return -1;

    }
}
