package ru.shik16.firstclass.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.shik16.firstclass.models.Student;
import ru.shik16.firstclass.repository.StudentRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public List<Student> findByNameAndBirthday(String fullName, String birthday){
        return studentRepository.findByFullNameAndBirthday(fullName,birthday);
    }
}
