package ru.shik16.firstClass.entity;


import javax.persistence.Entity;
import javax.persistence.FieldResult;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    private int studentId;

    private String studentFullName;

    private Date studentBirthDay;

    private String studentClass;

    public Student() {
    }

    public Student(int studentId, String studentFullName, Date studentBirthDay, String studentClass) {
        this.studentId = studentId;
        this.studentFullName = studentFullName;
        this.studentBirthDay = studentBirthDay;
        this.studentClass = studentClass;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentFullName() {
        return studentFullName;
    }

    public void setStudentFullName(String studentFullName) {
        this.studentFullName = studentFullName;
    }

    public Date getStudentBirthDay() {
        return studentBirthDay;
    }

    public void setStudentBirthDay(Date studentBirthDay) {
        this.studentBirthDay = studentBirthDay;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }
}
