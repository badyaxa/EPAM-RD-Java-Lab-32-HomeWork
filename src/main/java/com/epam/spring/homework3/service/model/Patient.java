package com.epam.spring.homework3.service.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
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
    private LocalDate dateOfBirth;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<MedicalAppointment> hospitalCard = new java.util.LinkedHashSet<>();
}
