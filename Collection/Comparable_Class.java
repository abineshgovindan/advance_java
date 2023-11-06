package Advance_Java.Collection;

import java.util.*;

class Employee implements Comparable <Employee>
{
    int empId;
    String name;
    public Employee (int empId, String name)
    {
        this.empId=empId;
        this.name=name;
    }
    public String toString()
    {
        return this.empId + " " + this.name;
    }

    // Sorting by empId
    public int compareTo(Employee std){
        return this.empId - std.empId;

    }

}
public class Comparable_Class {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList <Employee> ( );
        list.add(new Employee(2, "Boman"));
        list.add(new Employee(1, "Abram"));
        list.add(new Employee(5, "Zeon"));
        list.add(new Employee(3, "Dinesh"));
        list.add(new Employee(4, "AB"));

        for (int i=0; i<list.size(); i++)
            System.out.println(list.get(i));
        // Sorting
        Collections.sort(list);
        // Displaying after sorting
        System.out.println("\nAfter Sorting :\n");
        for (int i=0; i<list.size(); i++)
            System.out.println(list.get(i));
    }
}
