package com.epam.spring.homework3.service.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.Set;

@Entity
@SuperBuilder
@NoArgsConstructor
@Getter
@Setter
@Table(name = "patients")
public class Patient extends Person {

    private String medicalDiagnosis;
    private String bloodType;
    private Date dateOfBirth;

    @OneToMany(mappedBy = "patient")
    private Set<MedicalAppointment> hospitalCard;
}
