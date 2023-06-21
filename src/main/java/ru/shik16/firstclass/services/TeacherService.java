package ru.shik16.firstclass.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.shik16.firstclass.models.Student;
import ru.shik16.firstclass.models.Teacher;
import ru.shik16.firstclass.repository.TeacherRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class TeacherService {

    private final TeacherRepository teacherRepository;
    private final StudentService studentService;

    @Autowired
    public TeacherService(TeacherRepository teacherRepository, StudentService studentService) {
        this.teacherRepository = teacherRepository;
        this.studentService = studentService;
    }

    public Teacher findById(int id) {
        return teacherRepository.findTeacherById(id);
    }

    public Teacher findTeacher(String fullName, String birthday) {
        String teacherId = "";
        List <Student> studentList = studentService.findByNameAndBirthday(fullName, birthday);

        for (int i = 0; i < studentList.size(); i++) {
            teacherId = studentList.get(i).getTeacherId();
        }
        return findById(Integer.parseInt(teacherId));
    }
}
