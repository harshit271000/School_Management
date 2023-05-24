package School_Management;

import java.util.List;
import java.util.Scanner;

// School can have many teachers and students
// Array list implements teachers and students

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    public List<Teacher> getTeachers() {          // getters and setters
        return teachers;
    }

    public void addTeachers(Teacher teacher) {            // ADDING TEACHER
        teachers.add(teacher);
    }

    public List<Student> getStudents() {           // returning list of students
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void TotalMoneySpent(int moneySpent) {
        totalMoneySpent -=  moneySpent;
    }
}
