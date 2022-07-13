package com.epam.spring.homework3.service.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@MappedSuperclass
@SuperBuilder
@NoArgsConstructor
@Getter
@Setter
@Table(name = "employees")
public class Employee extends Person {

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;
    private String additionalDescription;
}
