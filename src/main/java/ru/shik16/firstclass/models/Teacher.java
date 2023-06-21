package ru.shik16.firstclass.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "teacher")
@Getter
@Setter
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "th_id", nullable = false)
    private int id;

    @Column(name = "th_name", nullable = false)
    private String teacherName;

    @Column(name = "pr_id", nullable = false)
    private int educationId;


    public Teacher(int id, String teacherName, int educationId) {
        this.id = id;
        this.teacherName = teacherName;
        this.educationId = educationId;
    }

    public Teacher() {
    }
}
