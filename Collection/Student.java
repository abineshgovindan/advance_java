package Advance_Java.Collection;

class Student{
        int roll;
        String name;
        Student(int r,String n)
        {
            roll = r;
            name = n;
        }
        public String toString()
        {
            return roll+" "+name;
        }
}