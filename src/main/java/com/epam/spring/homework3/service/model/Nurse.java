package com.epam.spring.homework3.service.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;

@Entity
@Data
@SuperBuilder
@NoArgsConstructor
public class Nurse extends Employee {

    private String department;
}
