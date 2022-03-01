package ru.common.medclinicapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "patient")
public class PatientEntity {

    public PatientEntity(PatientEntity patient) { //copy constructor
        this.name = patient.getName();
        this.gender = patient.getGender();
        this.age = patient.getAge();
        this.city = patient.getCity();
        this.address = patient.getAddress();
        this.birthdayDt = patient.getBirthdayDt();
        this.birthPlace = patient.getBirthPlace();
        this.registration = patient.getRegistration();
        this.passportSeries = patient.getPassportSeries();
        this.passportNumber = patient.getPassportNumber();
        this.phoneNumber = patient.getPhoneNumber();
        this.anotherDocument = patient.getAnotherDocument();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //need to determine strategy that you need
    Long id;

    @NotBlank(message = "name is blank")
    @Column
    String name;

    @NotBlank(message = "gender is blank")
    @Column
    String gender;

    @NotBlank(message = "age is blank")
    @Column
    Integer age;

    @NotBlank(message = "city is blank")
    @Column
    String city;

    @NotBlank(message = "address is blank")
    @Column
    String address;

    @NotBlank(message = "birthday date is blank")
    @Column
    String birthdayDt; //need to check - maybe LocalDate should be used

    @NotBlank(message = "birth place is blank")
    @Column
    String birthPlace;

    @NotBlank(message = "registration place is blank")
    @Column
    String registration; //maybe boolean?

    @NotBlank(message = "passport series is blank")
    @Column
    Integer passportSeries; //just a number

    @NotBlank(message = "passport number is blank")
    @Column
    Integer passportNumber; //just a number

    @NotBlank(message = "phone number is blank")
    @Column
    String phoneNumber; //still could be a string because it could require country code (+7 - Russia)

    @Column
    String anotherDocument; //maybe there should be additional information like a number of driver license (Driver license - "license number")

}
