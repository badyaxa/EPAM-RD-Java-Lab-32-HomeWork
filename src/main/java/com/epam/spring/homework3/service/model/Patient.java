package com.epam.spring.homework3.service.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import java.util.Date;


@Entity
@Data
@SuperBuilder
@NoArgsConstructor
public class Patient extends Person {

    private boolean underTreatment;
    private Date dateOfBirth;
}
