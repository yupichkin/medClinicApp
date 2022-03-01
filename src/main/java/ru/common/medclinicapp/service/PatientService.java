package ru.common.medclinicapp.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import ru.common.medclinicapp.model.PatientEntity;
import ru.common.medclinicapp.repository.PatientRepository;

@Service
public class PatientService {
    private final PatientRepository patientRepository;

    @Autowired
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public void create(PatientEntity patient) {
        PatientEntity savedPatient = new PatientEntity(patient);
        patientRepository.save(savedPatient);
    }

}
