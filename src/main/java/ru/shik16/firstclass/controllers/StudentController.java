package ru.shik16.firstclass.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.shik16.firstclass.models.Education;
import ru.shik16.firstclass.models.Student;
import ru.shik16.firstclass.models.Teacher;
import ru.shik16.firstclass.services.EducationService;
import ru.shik16.firstclass.services.StudentService;
import ru.shik16.firstclass.services.TeacherService;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


@Controller
@RequestMapping("/")
public class StudentController {

    private final StudentService studentService;
    private final TeacherService teacherService;
    private final EducationService educationService;

    @Autowired
    public StudentController(StudentService studentService, TeacherService teacherService, EducationService educationService) {
        this.studentService = studentService;
        this.teacherService = teacherService;
        this.educationService = educationService;
    }


//    @GetMapping("/")
//    public String showSearch(Model model, @RequestParam(value = "search1", required = false) String search1,
//                             @RequestParam(value = "search2", required = false) String search2) {
//        if (search1 == null) {
//            return "main";
//        }
//        Student student = studentService.findByNameAndBirthday(search1,search2);
//        Teacher teacher = teacherService.findByTeacherId(student.getTeacherId());
//        Education education = educationService.findById(teacher.getEducationId());
//        model.addAttribute("student", student);
//        model.addAttribute("teacher", teacher);
//        model.addAttribute("education", education);
//        return "main";
//    }

    @GetMapping("/")
    public String showInfo(Model model, @RequestParam(value = "fullName", required = false) String search1,
                             @RequestParam(value = "birthday", required = false) String search2) {
        if (search1 != null) {
        Student student = studentService.findByNameAndBirthday(search1,search2);
        Teacher teacher = teacherService.findByTeacherId(student.getTeacherId());
        Education education = educationService.findById(teacher.getEducationId());
        model.addAttribute("student", Collections.singletonList(student));
        model.addAttribute("teacher", teacher);
        model.addAttribute("education", education);
        }
        return "main";
    }

//    @GetMapping("/")
//    public String showSearch(Model model, @RequestParam(value = "search1", required = false) String search1,
//                             @RequestParam(value = "search2", required = false) String search2) {
//        if (search1 != null) {
//            Object studentInfo = studentInfoFinder.findByInfo(search1,search2);
//            model.addAttribute("student", Collections.singletonList(studentInfo.getStudent));
//            model.addAttribute("teacher", studentInfo.getTeacher);
//            model.addAttribute("education", studentInfo.getEducation);
//        }
//        return "main";
//    }

}
