package com.epam.spring.homework3.service.impl;

import com.epam.spring.homework3.service.NurseService;
import com.epam.spring.homework3.service.model.Nurse;
import com.epam.spring.homework3.service.repository.NurseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class NurseServiceImpl implements NurseService {

    private final NurseRepository nurseRepository;

    public List<Nurse> listNurses() {
        log.info("---NurseServiceImpl.listNurses()");
        return nurseRepository.findAll();
    }
}
