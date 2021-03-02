package com.pdang.springbootunittest.converter;

import com.pdang.springbootunittest.dto.StudentDTO;
import com.pdang.springbootunittest.entity.StudentEntity;
import org.springframework.stereotype.Component;

@Component
public class StudentConverter {
    public StudentEntity toEntity(StudentDTO studentDTO) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setName(studentDTO.getName());
        studentEntity.setAge(studentDTO.getAge());
        studentEntity.setGender(studentDTO.getGender());
        studentEntity.setAddress(studentDTO.getAddress());
        studentEntity.setScore(studentDTO.getScore());
        return studentEntity;
    }

    public StudentDTO toDTO(StudentEntity studentEntity) {
        StudentDTO studentDTO = new StudentDTO();
        if (studentEntity.getId() != null) {
            studentDTO.setId(studentEntity.getId());
        }
        studentDTO.setName(studentEntity.getName());
        studentDTO.setAge(studentEntity.getAge());
        studentDTO.setGender(studentEntity.getGender());
        studentDTO.setAddress(studentEntity.getAddress());
        studentDTO.setScore(studentEntity.getScore());
        return studentDTO;
    }

    public StudentEntity toEntity(StudentDTO studentDTO, StudentEntity studentEntity) {
        studentEntity.setName(studentDTO.getName());
        studentEntity.setAge(studentDTO.getAge());
        studentEntity.setGender(studentDTO.getGender());
        studentEntity.setAddress(studentDTO.getAddress());
        studentEntity.setScore(studentDTO.getScore());
        return studentEntity;
    }
}
