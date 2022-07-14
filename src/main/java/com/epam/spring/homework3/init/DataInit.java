package com.epam.spring.homework3.init;

import com.epam.spring.homework3.service.model.Doctor;
import com.epam.spring.homework3.service.model.MedicalAppointment;
import com.epam.spring.homework3.service.model.Nurse;
import com.epam.spring.homework3.service.model.Patient;
import com.epam.spring.homework3.service.model.enums.DoctorSpecialization;
import com.epam.spring.homework3.service.model.enums.MedicalAppointmentType;
import com.epam.spring.homework3.service.repository.DoctorRepository;
import com.epam.spring.homework3.service.repository.MedicalAppointmentRepository;
import com.epam.spring.homework3.service.repository.NurseRepository;
import com.epam.spring.homework3.service.repository.PatientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import java.time.Instant;
import java.time.LocalDate;

@Slf4j
@Configuration
public class DataInit implements ApplicationRunner {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private NurseRepository nurseRepository;

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private MedicalAppointmentRepository medicalAppointmentRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        for (int i = 1; i <= 10; i++) {

            DoctorSpecialization doctorSpecialization;
            if (i % 7 == 0) {
                doctorSpecialization = DoctorSpecialization.UROLOGY;
            } else if (i % 5 == 0) {
                doctorSpecialization = DoctorSpecialization.OTOLARYNGOLOGIST;
            } else if (i % 3 == 0) {
                doctorSpecialization = DoctorSpecialization.CARDIOLOGY;
            } else if (i % 2 == 0) {
                doctorSpecialization = DoctorSpecialization.PEDIATRICS;
            } else {
                doctorSpecialization = DoctorSpecialization.FAMILY_MEDICINE;
            }
            final Doctor doctor = new Doctor().builder()
                    .firstName("DoctorfirstName" + i)
                    .lastName("DoctorlastName" + i)
                    .phone("+380 97 " + i + "00-00-00")
                    .email("email" + i + "@gmail.com")
                    .password("password" + i)
                    .created(Instant.now())
                    .specialization(doctorSpecialization)
                    .build();
            doctorRepository.save(doctor);

            for (int j = 0; j < 2; j++) {
                final Nurse nurse = new Nurse().builder()
                        .firstName("NursefirstName" + i + j)
                        .lastName("NurselastName" + i + j)
                        .phone("+380 67 " + i + "00-00-0" + j)
                        .email("email" + i + j + "@gmail.com")
                        .password("password" + i + j)
                        .created(Instant.now())
                        .department("department" + i + j)
                        .build();
                nurseRepository.save(nurse);

                for (int k = 0; k < 2; k++) {
                    final Patient patient = new Patient().builder()
                            .firstName("PatientfirstName" + i + j + k)
                            .lastName("PatientlastName" + i + j + k)
                            .phone("+380 50 " + i + "00-00-" + j + k)
                            .created(Instant.now())
                            .bloodType("A+")
                            .dateOfBirth(LocalDate.now())
                            .build();
                    patientRepository.save(patient);

                    final MedicalAppointment medicalAppointmentDrug = new MedicalAppointment().builder()
                            .appointmentType(MedicalAppointmentType.DRUG)
                            .patient(patient)
                            .writtedAt(Instant.now())
                            .build();
                    medicalAppointmentRepository.save(medicalAppointmentDrug);

                    final MedicalAppointment medicalAppointmentProcedure = new MedicalAppointment().builder()
                            .appointmentType(MedicalAppointmentType.PROCEDURE)
                            .patient(patient)
                            .writtedAt(Instant.now())
                            .build();
                    medicalAppointmentRepository.save(medicalAppointmentProcedure);

                    final MedicalAppointment medicalAppointmentOperation = new MedicalAppointment().builder()
                            .appointmentType(MedicalAppointmentType.OPERATION)
                            .patient(patient)
                            .writtedAt(Instant.now())
                            .build();
                    medicalAppointmentRepository.save(medicalAppointmentOperation);
                }
            }
        }
        log.info("--------------DataInit.run()--------------");
    }
}
