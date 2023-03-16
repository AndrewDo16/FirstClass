package ru.shik16.firstClass.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.shik16.firstClass.service.StudentService;

import java.util.Date;

@Controller
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("student", studentService.findAll());
        return "index";
    }

//    @GetMapping("/{search1}/{search2}")
//    public String index(Model model, @PathVariable("search1") String fullName, @PathVariable("search2") Date birthdate) {
//        model.addAttribute("student1", studentService.findStudent(fullName, birthdate));
//        return "index";
//    }


//    @GetMapping("/")
//    public String showSearchForm(Model model, @RequestParam(value = "search1", required = false) String search1,
//                                 @RequestParam(value = "search2", required = false) Date search2) {
//        if (search1 != null) {
//            model.addAttribute("student", studentService.findStudent(search1, search2));
//        }
//        return "index";
//    }

//
//    @GetMapping("/search_student")
//    public String showSearchForm(Model model, @RequestParam(value = "search1", required = false) String search1) {
//        if (search1 != null) {
//            model.addAttribute("student", studentService.findStudentTest(search1));
//        }
//        return "index";
//    }
//
//    @GetMapping("/home")
//    public String homePage() {
//        return "home";
//    }


}
