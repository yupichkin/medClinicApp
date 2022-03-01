package ru.common.medclinicapp.repository;

import ru.common.medclinicapp.model.PatientEntity;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<PatientEntity, Long> {
    //Recipe findRecipeById(Long id); //TODO: remove because already exist findByID
    //List<Recipe> findAllByCategoryIgnoreCaseOrderByDateDesc(String category);
    //List<Recipe> findAllByNameContainingIgnoreCaseOrderByDateDesc(String name);
}
