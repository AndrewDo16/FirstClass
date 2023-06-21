package ru.shik16.firstclass.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shik16.firstclass.models.Education;

import java.util.List;

@Repository
public interface EducationRepository extends JpaRepository<Education, Integer> {
    Education findById(int id);
}
