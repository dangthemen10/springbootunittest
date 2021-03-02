package com.pdang.springbootunittest.service;

import com.pdang.springbootunittest.dto.CreateStudentRequest;
import com.pdang.springbootunittest.dto.UpdateStudentRequest;
import com.pdang.springbootunittest.entity.StudentEntity;

import java.util.List;

public interface StudentService {

    List<StudentEntity> getAllStudents();

    StudentEntity createStudent(CreateStudentRequest createStudentRequest);

    StudentEntity updateStudent(UpdateStudentRequest updateStudentRequest);

    String deleteStudent(long id);
}
