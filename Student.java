package School_Management;

import java.util.Scanner;

// This class keeps student fees, name, id, fees paid

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;


    // Role of Constructor to create a new student object
    // Initialize fees = 30000
    // Fees paid initially = 0

    public Student(int id, String name, int grade){
        this.feesPaid = 0;
        this.feesTotal = 30000; 
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Not going to alter student name, student id.
    // grade used to update grade of the student

    public int getId() {                             // GETTERS
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }



    // Add fees to the fees paid
    // Keep adding the fees to fees paid.

    public void payFees(int fees){
        this.feesPaid = feesPaid + fees;
        School.updateTotalMoneyEarned(feesPaid);

    }

    public int getRemainingFees(){
       return feesTotal - feesPaid;
    }


    @Override
    public String toString() {
        return "Student's Name = "+ name + " Total fees paid so far $"+ feesPaid;
    }


}
