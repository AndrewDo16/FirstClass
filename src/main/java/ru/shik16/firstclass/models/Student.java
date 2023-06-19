package ru.shik16.firstclass.models;

import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;


@Table(name = "student")

public class Student {

    private int id;

    private String fullName;

    private Date birthday;

    private String className;


    public Student() {
    }

    public Student(int id, String fullName, Date birthday, String className) {
        this.id = id;
        this.fullName = fullName;
        this.birthday = birthday;
        this.className = className;
    }


    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
