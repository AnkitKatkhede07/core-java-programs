/**
 32. Sort Employee Names in Reverse Order
Description: Sort names from Z to A.
 
 **/
package org.shorting;

import java.util.ArrayList;
import java.util.Collections;

class Employe implements Comparable<Employe> {

    private int id;
    private String name;
    private int sal;

    public Employe(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    // Only Name Getter
    public String getName() {
        return name;
    }

    // Print Employee Details
    public void printEmployee() {
        System.out.println(
                "Id = " + id +
                ", Name = " + name +
                ", Salary = " + sal);
    }

    @Override
    public int compareTo(Employe e) {

        // Reverse Order (Z to A)
        return e.name.compareTo(this.name);

        // Ascending Order (A to Z)
        // return this.name.compareTo(e.name);
    }
}

public class SortEmployeeNamesReverseOrder {

    public static void main(String[] args) {

        ArrayList<Employe> list = new ArrayList<>();

        list.add(new Employe(101, "Ankit", 50000));
        list.add(new Employe(102, "Amit", 40000));
        list.add(new Employe(103, "Arjun", 60000));
        list.add(new Employe(104, "Rahul", 55000));

        System.out.println("Before Sorting:");
        for (Employe e : list) {
            e.printEmployee();
        }

        Collections.sort(list);

        System.out.println("\nAfter Reverse Sorting (Z to A):");
        for (Employe e : list) {
            e.printEmployee();
        }
    }
}