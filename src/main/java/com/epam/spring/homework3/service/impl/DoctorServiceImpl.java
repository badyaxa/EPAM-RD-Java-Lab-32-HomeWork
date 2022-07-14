package com.epam.spring.homework3.service.impl;

import com.epam.spring.homework3.service.DoctorService;
import com.epam.spring.homework3.service.model.Doctor;
import com.epam.spring.homework3.service.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class DoctorServiceImpl implements DoctorService {

    private final DoctorRepository repository;

    @Override
    public List<Doctor> listDoctors() {
        log.info("---DoctorServiceImpl.listDoctors()");
        return repository.findAll();
    }
}
