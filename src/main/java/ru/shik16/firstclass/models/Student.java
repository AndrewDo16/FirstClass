package ru.shik16.firstclass.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;


@Entity
@Table(name = "Student")
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "st_id", nullable = false)
    private int id;

    @Column(name = "st_name", nullable = false)
    private String fullName;

    @Column(name = "st_birthday", nullable = false)
    private String birthday;

    @Column(name = "st_class", nullable = false)
    private String className;


    public Student() {
    }

    public Student(int id, String fullName, String birthday, String className) {
        this.id = id;
        this.fullName = fullName;
        this.birthday = birthday;
        this.className = className;
    }

}
