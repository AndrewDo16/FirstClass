package ru.shik16.firstClass.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.shik16.firstClass.entity.Student;
import ru.shik16.firstClass.repository.StudentRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.shik16.firstClass.service.rowMapper.StudentRowMapper;

import java.util.Date;
import java.util.List;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

//    public List<Student> findStudent(String fullName, Date birthday) {
//        return jdbcTemplate.query("SELECT * FROM Student WHERE full_name=?",
//                new Object[]{fullName},
//                studentRowMapper);
//    }
//
//    public List<Student> findStudentTest(String fullName) {
//        return jdbcTemplate.query("SELECT * FROM Student WHERE full_name=?",
//                new Object[]{fullName},
//                studentRowMapper);
//    }
}
