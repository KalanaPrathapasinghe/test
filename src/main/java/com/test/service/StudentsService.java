package com.test.service;

import com.test.entity.Students;
import com.test.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {

    @Autowired
    private StudentsRepository studentsRepository;

    public Students saveNewStudent(Students students)
    {
        Students newStudent = studentsRepository.save(students);
        return newStudent;

    }

    public List<Students> getAllStudents()
    {
        List<Students> studentsList = studentsRepository.findByStatus(1);
        return studentsList;
    }

    public Students getStudentById(long studentId)
    {
        Students students = studentsRepository.findByStudentIdAndStatus(studentId,1);
        return students;
    }


}
