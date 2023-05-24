package School_Management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"Lizzy", 500);
        Teacher Melisa = new Teacher(2, "Melisa", 1000);
        Teacher Titu = new Teacher(3, "Titu", 1200);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(Melisa);
        teacherList.add(Titu);

        Student Harshit = new Student(1,"Harshit", 4);
        Student Lucky = new Student(2, "Lucky", 12);
        Student Tina = new Student(3, "Tina", 11);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Harshit);
        studentList.add(Lucky);
        studentList.add(Tina);

        School vns = new School(teacherList, studentList);



        Harshit.payFees(5000);
        Lucky.payFees(6000);
        System.out.println("VNS has earned $" + vns.getTotalMoneyEarned());


        System.out.println("----Making VNS Pay Salary---");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("VNS has spent for salary to " + lizzy.getName() + " and now has $ " + vns.getTotalMoneyEarned());

        Titu.receiveSalary(Titu.getSalary());
        System.out.println("VNS has spent for salary to " + Titu.getName() + " and now has $ " + vns.getTotalMoneyEarned());

        System.out.println(Harshit);
        System.out.println(Titu);
    }
}
