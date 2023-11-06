package Advance_Java.ExceptionHandling;

//class Super
//{
//    void show() {
//        System.out.println("parent class");
//    }
//}
////Checked Exception
//public class Sub extends Super {
//    void show() throws IOException
//    //Compile time error
//    {
//        System.out.println("parent class");
//    }
//}
////UnChecked Exception
//class Sub2 extends Super {
//    void show() throws ArrayIndexOutOfBoundsException {
//        System.out.println("child class");
//    }
//
//}


///Example of Subclass overriden method with same Exception

class Super2
{
    void show() throws Exception
    {  System.out.println("parent class");  }
}

class newClass extends Super2 {
    void show() throws Exception           //Correct
    {
        System.out.println("child class");
    }
}


  //  Example of Subclass overriden method with no Exception
  class newClass2 extends Super2 {
      void show()             //Correct
      {
          System.out.println("child class");
      }
  }
public class OverridingException {
    public static void main(String[] args) {
////        Super Checked  = new Sub();
//        Super UnChecked = new Sub2();
//        UnChecked.show();
////        Checked.show();
        try{
//            Super2 obj = new newClass();
//            obj.show();
            Super2 obj = new newClass2();
            obj.show();

        }catch (Exception e){
            System.out.println(e);
        }

    }

}
