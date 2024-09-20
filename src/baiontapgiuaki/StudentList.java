
package baiontapgiuaki;

import java.util.ArrayList;
import java.util.Date;


public class StudentList extends Student {

    public ArrayList<Student> studentList;

    public StudentList(ArrayList<Student> studentList, float gpa, String major, Date dateOfBirth, String id, String fullName) {
        super(gpa, major, dateOfBirth, id, fullName);
        this.studentList = studentList;
    }

    

    public StudentList() {
        this.studentList = new ArrayList<>();
    }


    public void addStudent(Student student) {
        studentList.add(student);

    }

    public void deleteStudentByID(String id) {
        studentList.removeIf(Student -> this.getId().equals(id));
    }

    public Student findStudentByID(String id) {
        for (Student student : studentList) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudent() {
        for (Student student : studentList) {
            student.displayInfor();
            System.out.println();
        }
    }

    public Student findTopStudent() {
        if (studentList.isEmpty()) {
            return null;
        }

        Student topStudent = studentList.get(0);
        for (Student student : studentList) {
            if (student.getGpa() > topStudent.getGpa()) {
                topStudent = student;
            }
        }
        return topStudent;

    }

}
