package School_Management;

import java.util.Scanner;

// This class is responsible for teacher data.

public class Teacher {

    private int id;
    private String name;
    private int salary;

    // This is Constructor

    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    // Returning Values
    // Returning Values

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public void receiveSalary(int salary){       // adds to the salary and removes from the total money earned
    }

    @Override
    public String toString() {
        return "Name of the teacher = "+ name + " Total salary earned so far $"+ salary;
    }
}
