package com.mycompany.mavenproject1;

import java.util.Date;
import java.text.SimpleDateFormat;

class Student {
    private String studentNo;
    private String studentName;
    private Date dateOfBirth;
    private Integer tariffPoints;
    private static int noOfStudents = 0;

    public Student() {
        this.studentNo = "not known";
        this.studentName = "not known";
        try {
            // Replaced "st" to safely parse the default date
            this.dateOfBirth = new SimpleDateFormat("d MMMM yyyy").parse("1st January 1995".replace("st", ""));
        } catch (Exception e) {
            this.dateOfBirth = new Date();
        }
        this.tariffPoints = 20;
        noOfStudents++;
    }

    public Student(String studentNo, String studentName, Date dateOfBirth, Integer tariffPoints) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.dateOfBirth = dateOfBirth;
        setTariffPoints(tariffPoints);
        noOfStudents++;
    }

    public String getStudentNo() { return studentNo; }
    public void setStudentNo(String studentNo) { this.studentNo = studentNo; }

    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }

    public Date getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(Date dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public Integer getTariffPoints() { return tariffPoints; }
    public void setTariffPoints(Integer tariffPoints) {
        if (tariffPoints != null && tariffPoints >= 20 && tariffPoints <= 280) {
            this.tariffPoints = tariffPoints;
        } else {
            this.tariffPoints = 20;
        }
    }

    public static int getNoOfStudents() { return noOfStudents; }
    public String getFormattedDOB() {
        return new SimpleDateFormat("dd/MM/yyyy").format(this.dateOfBirth);
    }
}

public class Salvador_prog6 {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("--- Student 1 Details ---");
        System.out.println("ID: " + s1.getStudentNo());
        System.out.println("Name: " + s1.getStudentName());
        System.out.println("DOB: " + s1.getFormattedDOB());
        System.out.println("Points: " + s1.getTariffPoints());

        Student s2 = new Student("S123", "John Doe", new Date(), 250);
        System.out.println("\n--- Student 2 Details ---");
        System.out.println("ID: " + s2.getStudentNo());
        System.out.println("Name: " + s2.getStudentName());
        System.out.println("DOB: " + s2.getFormattedDOB());
        System.out.println("Points: " + s2.getTariffPoints());

        System.out.println("\nTotal Students Registered: " + Student.getNoOfStudents());
    }
}
