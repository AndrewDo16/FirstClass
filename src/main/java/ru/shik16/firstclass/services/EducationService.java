package ru.shik16.firstclass.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.shik16.firstclass.models.Education;
import ru.shik16.firstclass.repository.EducationRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class EducationService {

    private final EducationRepository educationRepository;
    @Autowired
    public EducationService(EducationRepository educationRepository) {
        this.educationRepository = educationRepository;
    }

    public Education findById(int id){
        return educationRepository.findById(id);
    }

}
