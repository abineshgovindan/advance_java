package Advance_Java.StringObj;

import java.util.StringTokenizer;

public class StringTokenizerClass {
    public static void main(String[] args) {
//        String str = new String("Hello guys!, was sup ");
//        StringTokenizer st = new StringTokenizer(str);
//        while(st.hasMoreTokens()){
//            System.out.println(st.nextToken());

//        }

        String a= " : ";
        String b= "Welcome : to : studytonight : . : How : are : You : ?";
        StringTokenizer st = new StringTokenizer(b,a);
        int count = st.countTokens();
        for (int i =0; i < count; i++){
            System.out.println("Token [" + i + "] : "+ st.nextToken());


        }
        StringTokenizer d = null;
        while (st.hasMoreTokens()){
            System.out.println(d.nextToken());
        }
    }
}
