package com.epam.spring.homework3.controller;

import com.epam.spring.homework3.service.model.Doctor;
import com.epam.spring.homework3.service.model.Nurse;
import com.epam.spring.homework3.service.model.Patient;
import com.epam.spring.homework3.service.repository.DoctorRepository;
import com.epam.spring.homework3.service.repository.NurseRepository;
import com.epam.spring.homework3.service.repository.PatientRepository;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
Адміністратору системи доступний список Лікарів
    за категоріями (педіатр, травматолог, хірург, ...)
і список Пацієнтів.

Реалізувати можливість сортування:

пацієнтів:
за алфавітом;
за датою народження;
лікарів:
за алфавітом;
за категорією;
за кількістю пацієнтів.
*/

@Slf4j
@RestController
@RequestMapping("/reception")
@Tag(name = "Reception Controller", description = "Адміністратору системи доступний список"
        + " Лікарів за категоріями (педіатр, травматолог, хірург, ...) і список Пацієнтів.")
@AllArgsConstructor
public class ReceptionController {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private NurseRepository nurseRepository;

    @Autowired
    private PatientRepository patientRepository;

    // TODO: сортування лікарів:
//    за алфавітом;
//    за категорією;
//    за кількістю пацієнтів.
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/doctors")
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/nurses")
    public List<Nurse> getAllNurses() {
        return nurseRepository.findAll();
    }

    // TODO: сортування пацієнтів:
//    за алфавітом;
//    за датою народження;
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/patients")
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    // TODO: Адміністратор реєструє в системі лікарів
//    @ResponseStatus(HttpStatus.CREATED)
//    @PostMapping("/doctor")
//    public DoctorDto createDoctor(@RequestBody DoctorDto doctorDto) {
//        return doctorService.createDoctor(doctorDto);
//    }

    // TODO: Адміністратор реєструє в системі пацієнтів і призначає пацієнтові лікаря
//    @ResponseStatus(HttpStatus.CREATED)
//    @PostMapping("/patient")
//    public PatientDto createPatient(@RequestBody PatientDto patientDto, Long doctorId) {
//        return patientService.createPatient(patientDto, doctorId);
//    }
}
