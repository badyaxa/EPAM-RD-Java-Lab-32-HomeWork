package com.epam.spring.homework3.service.model;

import com.epam.spring.homework3.service.model.enums.DoctorSpecialization;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@SuperBuilder
@NoArgsConstructor
@Getter
@Setter
@Table(name = "doctors")
public class Doctor extends Employee {

    @Enumerated(EnumType.ORDINAL)
    private DoctorSpecialization specialization;
}
