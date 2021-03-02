package com.pdang.springbootunittest.service.impl;

import com.pdang.springbootunittest.dto.CreateStudentRequest;
import com.pdang.springbootunittest.dto.UpdateStudentRequest;
import com.pdang.springbootunittest.entity.StudentEntity;
import com.pdang.springbootunittest.repository.StudentRepository;
import com.pdang.springbootunittest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServerImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public StudentEntity createStudent(CreateStudentRequest createStudentRequest) {
        StudentEntity studentEntity = new StudentEntity(createStudentRequest);
        studentEntity = studentRepository.save(studentEntity);
        return studentEntity;
    }

    @Override
    public StudentEntity updateStudent(UpdateStudentRequest updateStudentRequest) {
        StudentEntity studentEntity = studentRepository.findById(updateStudentRequest.getId()).get();
        if (updateStudentRequest.getName() != null && !updateStudentRequest.getName().isEmpty()) {
            studentEntity.setName(updateStudentRequest.getName());
        }
        if (updateStudentRequest.getAge() != null) {
            studentEntity.setAge(updateStudentRequest.getAge());
        }
        if (updateStudentRequest.getGender() != null && !updateStudentRequest.getGender().isEmpty()) {
            studentEntity.setGender(updateStudentRequest.getGender());
        }
        if (updateStudentRequest.getAddress() != null && !updateStudentRequest.getAddress().isEmpty()) {
            studentEntity.setAddress(updateStudentRequest.getAddress());
        }
        if (updateStudentRequest.getScore() != null && !updateStudentRequest.getScore().isNaN()) {
            studentEntity.setScore(updateStudentRequest.getScore());
        }
        studentEntity = studentRepository.save(studentEntity);
        return studentEntity;
    }

    @Override
    public String deleteStudent(long id) {
        studentRepository.deleteById(id);
        return "Student has been deleted successfully!";
    }

}
