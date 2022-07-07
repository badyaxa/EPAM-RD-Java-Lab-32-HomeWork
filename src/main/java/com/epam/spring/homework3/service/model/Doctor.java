package com.epam.spring.homework3.service.model;

import com.epam.spring.homework3.service.model.enums.DoctorSpecialization;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Data
@SuperBuilder
@NoArgsConstructor
public class Doctor extends Employee {

    @Enumerated(EnumType.ORDINAL)
    private DoctorSpecialization specialization;
}
