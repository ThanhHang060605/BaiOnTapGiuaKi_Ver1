
package baiontapgiuaki;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Student extends Person {

    private float gpa;
    private String major;
    private Date dateOfBirth;

    public Student() {
    }

    public Student(float gpa, String major, Date dateOfBirth, String id, String fullName) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
        this.dateOfBirth = dateOfBirth;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    

    public void addStudent(String id, String fullName, Date dateOfBirth, float GPA, String major) {
        this.id = id;
        this.fullName = fullName;
        this.gpa = GPA;
        this.dateOfBirth = dateOfBirth;
        this.major = major;

    }

    @Override
    public void displayInfor() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = dateFormat.format(dateOfBirth);
        System.out.println("ID: " + id);
        System.out.println("Full name: " + fullName);
        System.out.println("Date of birth: " + formattedDate);
        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major);
    }

  

}
