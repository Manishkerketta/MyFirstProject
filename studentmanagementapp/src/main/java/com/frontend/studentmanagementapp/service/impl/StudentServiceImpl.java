package com.frontend.studentmanagementapp.service.impl;

import com.frontend.studentmanagementapp.entity.Student;
import com.frontend.studentmanagementapp.repository.StudentRepository;
import com.frontend.studentmanagementapp.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }


    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }


    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }


    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }


    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

}
