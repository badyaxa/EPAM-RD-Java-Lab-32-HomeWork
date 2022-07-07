package com.epam.spring.homework3.service.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
@SuperBuilder
@NoArgsConstructor
public class Employee extends Person {

        private String email;
        private String password;
        private String additionalDescription;
}
