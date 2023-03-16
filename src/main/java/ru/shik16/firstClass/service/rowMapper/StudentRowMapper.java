package ru.shik16.firstClass.service.rowMapper;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import ru.shik16.firstClass.entity.Student;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class StudentRowMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Student(
                rs.getInt("id"),
                rs.getString("full_name"),
                rs.getDate("birthday"),
                rs.getString("class")
        );
    }
}
