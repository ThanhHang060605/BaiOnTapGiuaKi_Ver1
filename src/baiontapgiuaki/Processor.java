package baiontapgiuaki;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Processor {

    public static void main(String[] args) throws ParseException{
       

        StudentList studentList = new StudentList();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("******Choice an option*********");
            System.out.println("1. Add a new Student");
            System.out.println("2. Update a student by id");
            System.out.println("3. Delete a student by id");
            System.out.println("4. Display all students");
            System.out.println("5. Find the student with highest GPA");
            System.out.println("6. Exit");
            System.out.println("--------Choice the number----------");
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Full Name: ");
                    String fullName = sc.nextLine();
                    System.out.print("Enter Date Of Birth(dd/MM/yyyy): ");
                    String dob = sc.nextLine();
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
                    Date dateOfBirth = sdf.parse(dob);
                    System.out.print("Enter GPA: ");
                    float gpa = sc.nextFloat();
                    sc.nextLine();
                    System.out.print("Enter major: ");
                    String major = sc.nextLine();
                    studentList.addStudent(new Student(gpa, major, dateOfBirth, id, fullName));
                    System.out.println("--------------");
                    break;
                case 2:
                    System.out.print("Enter ID of the student to update: ");
                    String updateID = sc.nextLine();
                    Student studentToUpdate = studentList.findStudentByID(updateID);
                    
                    if (studentToUpdate != null) {
                        System.out.print("Enter newName: ");
                        String newName = sc.nextLine();
                        studentToUpdate.setFullName(newName);
                        
                        System.out.print("Enter new GPA: ");
                        float newGpa = sc.nextFloat();
                        studentToUpdate.setGpa(newGpa);
                        sc.nextLine();
                        
                        System.out.print("Enter new major: ");
                        String newMajor = sc.nextLine();
                        studentToUpdate.setMajor(newMajor);
                        
                        System.out.println("Student updated successfully.");
                        System.out.println("-----------");
                        
                    } else {
                        System.out.println("Student not found");
                        System.out.println("-----------");
                    }
                    break;
                case 3:
                    System.out.print("Enter ID of the student to delete: ");
                    String deleteID = sc.nextLine();
                    studentList.deleteStudentByID(deleteID);
                    System.out.println("Student deleted successfuly.");
                    System.out.println("-----------");
                    break;
                case 4:
                    studentList.displayAllStudent();
                    break;
                case 5:
                    Student topStudent = studentList.findTopStudent();
                    if (topStudent != null) {
                        System.out.println("Student with the highest GPA: ");
                        topStudent.displayInfor();
                    } else {
                        System.out.println("No student in the list");
                        System.out.println("-------------");
                    }
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    System.out.println("-----------");
                    break;
            }
        }
        sc.close();
    }

}

