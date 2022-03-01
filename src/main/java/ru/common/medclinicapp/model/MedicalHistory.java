package ru.common.medclinicapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "medical history")
public class MedicalHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //need to determine strategy that you need
    Long id;

    @Column
    Long patient; //id of patient entity

    @NotBlank(message = "document number is blank")
    @Column
    Long docNumber;

    @NotBlank(message = "create date time is blank")
    @Column
    String createDttm; //check - could be LocalDateTime;

    @NotBlank(message = "modify date time is blank")
    @Column
    String modifyDttm; //check - could be LocalDateTime;

    @NotBlank(message = "doctor name is blank")
    @Column
    String doctor; //there it could be a name ot id of doctor?

    @NotBlank(message = "diagnosis is blank")
    @Column
    String diagnosis; //there it could be a name ot id of doctor?

    @NotBlank(message = "medical history is blank")
    @Column
    Long medicalHistory; //id of previous medicine card (maybe there could be a ArrayList of these IDs)
}
