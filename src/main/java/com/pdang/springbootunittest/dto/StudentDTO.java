package com.pdang.springbootunittest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pdang.springbootunittest.entity.StudentEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    @JsonProperty("ID")
    private Long id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Age")
    private Integer age;
    @JsonProperty("Gender")
    private String gender;
    @JsonProperty("Address")
    private String address;
    @JsonProperty("Score")
    private Double score;

    public StudentDTO (StudentEntity studentEntity){
        this.id = studentEntity.getId();
        this.name = studentEntity.getName();
        this.age = studentEntity.getAge();
        this.gender = studentEntity.getGender();
        this.address = studentEntity.getAddress();
        this.score = studentEntity.getScore();
    }
}
