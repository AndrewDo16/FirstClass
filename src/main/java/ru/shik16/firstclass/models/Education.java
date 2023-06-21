package ru.shik16.firstclass.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "education")
@Getter
@Setter
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pr_id", nullable = false)
    private int id;

    @Column(name = "pr_name", nullable = false)
    private String programName;


    public Education(int id, String programName) {
        this.id = id;
        this.programName = programName;
    }

    public Education() {
    }
}
