package org.shorting;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private int sal;

    public Employee(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Employee e) {
        return this.name.compareTo(e.name);
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
    }
}

public class Sort_Employee_Names_Alphabetically {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Ankit", 50000));
        list.add(new Employee(102, "Amit", 40000));
        list.add(new Employee(103, "Arjun", 60000));
        list.add(new Employee(104, "Rahul", 55000));

        System.out.println("Before Sorting:");
        System.out.println(list);

        Collections.sort(list);

        System.out.println("\nAfter Sorting:");
        System.out.println(list);
    }
}

