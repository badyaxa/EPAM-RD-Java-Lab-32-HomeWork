package com.epam.spring.homework3.init;

import com.epam.spring.homework3.service.model.Doctor;
import com.epam.spring.homework3.service.model.Nurse;
import com.epam.spring.homework3.service.model.Patient;
import com.epam.spring.homework3.service.model.enums.DoctorSpecialization;
import com.epam.spring.homework3.service.repository.DoctorRepository;
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

    @Override
    public void run(ApplicationArguments args) throws Exception {

        for (int i = 1; i <= 15; i++) {

            final Doctor doctor = new Doctor().builder()
                    .firstName("DfirstName" + i)
                    .lastName("DlastName" + i)
                    .phone("+380 97 " + i + "00-00-00")
                    .email("email" + i + "@gmail.com")
                    .password("password" + i)
                    .created(Instant.now())
                    .specialization(DoctorSpecialization.PEDIATRICS)
                    .build();
            doctorRepository.save(doctor);

            final Nurse nurse = new Nurse().builder()
                    .firstName("NfirstName" + i)
                    .lastName("NlastName" + i)
                    .phone("+380 67 " + i + "00-00-00")
                    .email("email" + i + "@gmail.com")
                    .password("password" + i)
                    .created(Instant.now())
                    .department("department" + i)
                    .build();
            nurseRepository.save(nurse);

            final Patient patient = new Patient().builder()
                    .firstName("PfirstName" + i)
                    .lastName("PlastName" + i)
                    .phone("+380 50 " + i + "00-00-00")
                    .created(Instant.now())
                    .bloodType("A+")
                    .dateOfBirth(LocalDate.now())
                    .build();
            patientRepository.save(patient);

        }
        log.info("--------------DataInit.run()--------------");
    }
}
