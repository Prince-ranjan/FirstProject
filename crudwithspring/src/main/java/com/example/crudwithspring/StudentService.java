package com.example.crudwithspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private IstudentRepository studentRepository;


    public Student createStudent(Student student){
        return studentRepository.save(student);
    }

    public Student updateStudentDetails(Long id, Student updatedStudentDetails) {

        Optional<Student> optionalStudent = studentRepository.findById(id);

        Student student = optionalStudent.get();

        student.setEmail(updatedStudentDetails.getEmail());
        student.setName(updatedStudentDetails.getName());

        studentRepository.save(student);

        return student;
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
