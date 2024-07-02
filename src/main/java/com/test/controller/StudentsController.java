package com.test.controller;

import com.test.entity.Students;
import com.test.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("student")
public class StudentsController {
    @Autowired
    private StudentsService studentsService;

    @PostMapping("/save")
    public Students saveNewStudent(@RequestBody Students students)
    {
        return studentsService.saveNewStudent(students);
    }

    @GetMapping("/getAllStudents")
    public List<Students> getAllStudents()
    {
        return studentsService.getAllStudents();
    }

    @GetMapping("/getStudentById")
    public Students getStudentById(@RequestParam long studentId)
    {
        return studentsService.getStudentById(studentId);
    }

}
