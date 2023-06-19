package ru.shik16.firstclass.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.shik16.firstclass.services.StudentService;


@Controller
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
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
        }
        return "main";
    }

}
