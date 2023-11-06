package Advance_Java.StringObj;

public class Main {
    public static void main(String[] args) {
//        String st = "Hello World!";
//        String St2 = "Hello ";
//        System.out.println(st);
//        //St2 = st + "GUys";
//        String res = St2.concat("Guys");
//
//
//        System.out.println(res);
//        String s1 = new String("Abhi");
//        String s2 = "Viraaj";
//        String s3 = "Abhi";
//        String s4 = "Abhi";
//
//
//        int val = s1.compareTo(s3);// compare value in heap & string pool
//        boolean result = (s4 == s3);
//        System.out.println(res);
//        System.out.println(val);

//        String str = "studytonight";
//        System.out.println(str.charAt(5));

          //  String string = "java";
            //System.out.println(string.equalsIgnoreCase("JAVA"));

//        String str="StudyTonight";
//        System.out.println(str.indexOf("Ton"));

        String a1 = String.format("%d", 125);
        String a2 = String.format("%s", "studytonight");
        String a3 = String.format("%f", 125.00);
        String a4 = String.format("%x", 125);
        String a5 = String.format("%c", 'a');
        System.out.println("Integer Value: "+a1);
        System.out.println("String Value: "+a2);
        System.out.println("Float Value: "+a3);
        System.out.println("Hexadecimal Value: "+a4);
        System.out.println("Char Value: "+a5);

        System.out.printf("Hello %s -> %d", "Guys", 7);
    }
}
