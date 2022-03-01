package ru.common.medclinicapp.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.common.medclinicapp.model.PatientEntity;
import ru.common.medclinicapp.service.PatientService;

@RestController
@RequestMapping("/medical")
public class PatientController {
    @Autowired
    PatientService patientService;

    @PostMapping(value = "/patient")
    public ResponseEntity<?> create(@RequestBody PatientEntity patient) { //need to add @Valid to check nullable fields of entities
        patientService.create(patient);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
