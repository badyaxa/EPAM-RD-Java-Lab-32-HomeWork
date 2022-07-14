package com.epam.spring.homework3.service.impl;

import com.epam.spring.homework3.service.PatientService;
import com.epam.spring.homework3.service.model.Patient;
import com.epam.spring.homework3.service.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;

    @Override
    public List<Patient> listPatients() {
        log.info("---PatientServiceImpl.listPatients()");
        return patientRepository.findAll();
    }
}
