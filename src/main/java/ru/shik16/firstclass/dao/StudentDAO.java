package ru.shik16.firstclass.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.shik16.firstclass.dao.mappers.StudentRowMapper;
import ru.shik16.firstclass.models.Student;

import java.util.List;

@Component
public class StudentDAO {

    private final JdbcTemplate jdbcTemplate;
    private final StudentRowMapper studentRowMapper;


    @Autowired
    public StudentDAO(JdbcTemplate jdbcTemplate, StudentRowMapper studentRowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.studentRowMapper = studentRowMapper;
    }

    public List<Student> search(String fullName, String birthday) {
        return jdbcTemplate.query("SELECT * FROM Student WHERE LOWER(full_name) = LOWER(?) AND birthday = ?",
                new Object[]{fullName, birthday},
                studentRowMapper);
    }


}
