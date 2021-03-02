package com.pdang.springbootunittest.entity;

import com.pdang.springbootunittest.dto.CreateStudentRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="age")
    private Integer age;

    @Column(name="gender")
    private String gender;

    @Column(name="address")
    private String address;

    @Column(name = "score")
    private Double score;

    public StudentEntity(CreateStudentRequest createStudentRequest){
        this.name = createStudentRequest.getName();
        this.age = createStudentRequest.getAge();
        this.gender = createStudentRequest.getGender();
        this.address = createStudentRequest.getAddress();
        this.score = createStudentRequest.getScore();
    }
}
