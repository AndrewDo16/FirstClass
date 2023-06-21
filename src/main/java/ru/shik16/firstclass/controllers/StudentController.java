package ru.shik16.firstclass.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.shik16.firstclass.models.Student;
import ru.shik16.firstclass.models.Teacher;
import ru.shik16.firstclass.services.EducationService;
import ru.shik16.firstclass.services.StudentService;
import ru.shik16.firstclass.services.TeacherService;

import java.util.List;
import java.util.stream.Collectors;


@Controller
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
//        if (search1 != null) {
//            model.addAttribute("student", studentDAO.search(search1, search2));
//        }
//        return "main";
//    }

    @GetMapping("/")
    public String showSearch(Model model, @RequestParam(value = "search1", required = false) String search1,
                             @RequestParam(value = "search2", required = false) String search2) {
        if (search1 != null) {
            model.addAttribute("student", studentService.findByNameAndBirthday(search1,search2));
            model.addAttribute("teacher", teacherService.findTeacher(search1,search2));
            model.addAttribute("education", educationService.findById(teacherService.findTeacher(search1, search2).getEducationId()));
        }
        return "main";
    }



}
