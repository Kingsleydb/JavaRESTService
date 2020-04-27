package com.example.Proj1.model;

import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

@Data
@ToString
public class Person {

    @NonNull
    private String name;

    @NonNull
    private Integer age;
}
