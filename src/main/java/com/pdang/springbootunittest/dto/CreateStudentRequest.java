package com.pdang.springbootunittest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Setter
@Getter
public class CreateStudentRequest {

    @JsonProperty("Name")
    @NotBlank(message = "Name is required")
    private String name;

    @JsonProperty("Age")
    @NotNull(message = "Age is required")
    private Integer age;

    @JsonProperty("Gender")
    @NotBlank(message = "Gender is required")
    private String gender;

    @JsonProperty("Address")
    @NotBlank(message = "Address is required")
    private String address;

    @JsonProperty("Score")
    @NotNull(message = "Score is required")
    private Double score;
}
