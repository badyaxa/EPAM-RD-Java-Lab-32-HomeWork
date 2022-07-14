package com.epam.spring.homework3.service.model;

import com.epam.spring.homework3.service.model.enums.MedicalAppointmentType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Data
@SuperBuilder
@NoArgsConstructor
@Table(name = "medical_appointments")
public class MedicalAppointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Instant writtedAt = Instant.now();

    @Enumerated(EnumType.ORDINAL)
    private MedicalAppointmentType appointmentType;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;
}
