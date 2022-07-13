package com.epam.spring.homework3.service.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@SuperBuilder
@NoArgsConstructor
@Getter
@Setter
@Table(name = "nurses")
public class Nurse extends Employee {

    private String department;
}
