package ru.shik16.firstclass.services;

import org.springframework.stereotype.Service;
import ru.shik16.firstclass.models.Education;
import ru.shik16.firstclass.models.Student;
import ru.shik16.firstclass.models.Teacher;

@Service
public class StudentInfoFinder {

// TODO: 21.06.2023  реализовать модель ДТО.

    private final StudentService studentService;
    private final TeacherService teacherService;
    private final EducationService educationService;

    public StudentInfoFinder(StudentService studentService, TeacherService teacherService, EducationService educationService) {
        this.studentService = studentService;
        this.teacherService = teacherService;
        this.educationService = educationService;
    }


//    public Object findByInfo(String fullName, String birthday) {
//        Student student = studentService.findByNameAndBirthday(search1,search2);
//        Teacher teacher = teacherService.findByTeacherId(student.getTeacherId());
//        Education education = educationService.findById(teacher.getEducationId());
//
//        return new Object(student, teacher, education);
//    }
}
