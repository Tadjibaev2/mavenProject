package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class Human {
    private String name;
    private String surname;
    private int age;
    private int phoneNumber;
    private String national;
    private int weight;
    private int height;
    private String adress;
    private int closesize;
    private String mothername;
    private String fathername;

}
