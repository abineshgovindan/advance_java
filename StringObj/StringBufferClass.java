package Advance_Java.StringObj;

public class StringBufferClass {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
        System.out.println(sb);
        //modifying obj
        sb.append("World");
        System.out.println(sb);
        String str = "Hello";
        String str2 = str.concat(" Guys!");
        //We have to create a new obj  to abstract result
        System.out.println(str2);

        StringBuffer strB = new StringBuffer("study");
        strB.append("tonight");
        System.out.println(strB);
        strB.insert(0, "S");

        System.out.println(strB);
        strB.reverse();
        System.out.println(strB);
        sb.replace(0,1, "h");
        System.out.println(sb);



    }
}
