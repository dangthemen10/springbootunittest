package com.pdang.springbootunittest.controller;

import com.pdang.springbootunittest.dto.StudentDTO;
import com.pdang.springbootunittest.dto.CreateStudentRequest;
import com.pdang.springbootunittest.dto.UpdateStudentRequest;
import com.pdang.springbootunittest.entity.StudentEntity;
import com.pdang.springbootunittest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/api/student")
public class StudentController {

    @Value("${app.name}")
    private String appName;

    @Autowired
    private StudentService studentService;

    @GetMapping("/getAll")
    public List<StudentDTO> getAllStudent(){
        List<StudentEntity> studentEntityList = studentService.getAllStudents();
        List<StudentDTO> studentDTOList = new ArrayList<>();
        studentEntityList.stream().forEach((StudentEntity student) ->{
            studentDTOList.add(new StudentDTO(student));
        });
        return studentDTOList;
    }

    @PostMapping("/create")
    public StudentDTO createOneStudent(@Valid @RequestBody CreateStudentRequest studentRequest){
        StudentEntity studentEntity = studentService.createStudent(studentRequest);
        return new StudentDTO(studentEntity);
    }

    @PutMapping("/update")
    public StudentDTO updateOneStudent(@Valid @RequestBody UpdateStudentRequest updateStudentRequest){
        StudentEntity studentEntity = studentService.updateStudent(updateStudentRequest);
        return new StudentDTO(studentEntity);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteOneStudent(@PathVariable("id") long id){
        return studentService.deleteStudent(id);
    }
}
