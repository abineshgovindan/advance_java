package Advance_Java.StringObj;

public class StringBuilderClass {
    public static void main(String[] args) {
        //is not Thread Safe
        StringBuilder sb = new StringBuilder("study");
        System.out.println(sb);

        sb.append("tonight.com");
        System.out.println(sb);

    }
}
