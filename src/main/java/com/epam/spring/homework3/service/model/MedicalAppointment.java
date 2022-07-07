package com.epam.spring.homework3.service.model;

import com.epam.spring.homework3.service.model.enums.MedicalAppointmentType;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Data
@SuperBuilder
@NoArgsConstructor
public class MedicalAppointment {
    
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private Instant writtenOn;
    private String diagnosis;

    @Enumerated(EnumType.ORDINAL)
    private MedicalAppointmentType type;
}
