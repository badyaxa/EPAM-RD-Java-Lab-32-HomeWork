package com.epam.spring.homework3.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.time.ZoneId;

@Slf4j
@RestController
public class HomePageController {

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public String getMainPage() {
        log.info("-------------HomePageController.home()>>>");
        return "Local Time Is  <b>" + LocalTime.now(ZoneId.of("UTC+3")) + " (UTC+3)</b>"
                + "<br>"
                + "<br>"
                + "<a href=\"/h2-console\" target=\"_blank\">/h2-console</a>"
                + "<br>"
                + "<br>"
                + "<a href=\"/actuator/health\" target=\"_blank\">/actuator/health</a>"
                + "<br>"
                + "<br>"
                + "<a href=\"/swagger-ui.html\" target=\"_blank\">/swagger-ui</a>";
    }
}
