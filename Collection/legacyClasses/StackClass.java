package Advance_Java.Collection.legacyClasses;

import java.util.*;

public class StackClass {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(11);
        st.push(22);
        st.push(33);
        st.push(44);
        st.push(55);
        Enumeration e1 = st.elements();
        while(e1.hasMoreElements())
            System.out.print(e1.nextElement()+" ");
        st.pop();
        st.pop();

        System.out.println("\nAfter popping out two elements");

        Enumeration e2 = st.elements();

        while(e2.hasMoreElements())
            System.out.print(e2.nextElement()+" ");

    }

}
