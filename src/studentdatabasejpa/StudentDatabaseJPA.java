/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdatabasejpa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author acer
 */
public class StudentDatabaseJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student stu1 = new Student(63050105, "John", 3.5);
        Student stu2 = new Student(63050005, "Marry", 4.0);
        StudentTable.insertStudent(stu1);
        StudentTable.insertStudent(stu2);
        /*Student stu;
        stu = StudentTable.findStudentById(63050001);
        if (stu != null) {
            //stu.setName("Jimmy");
            StudentTable.removeStudent(stu);
            //StudentTable.updateStudent(stu);
        }*/
        //List<Student> stuList = StudentTable.findStudentByName("Marry"); 
        List<Student> stuList = StudentTable.findAllStudent();
        printAllStudent(stuList);
    }
    
    public static void printAllStudent(List<Student> studentList) {
        for(Student stu : studentList) {
           System.out.print(stu.getId() + " ");
           System.out.print(stu.getName() + " ");
           System.out.println(stu.getGPA() + " ");
        }
    }
    
}
