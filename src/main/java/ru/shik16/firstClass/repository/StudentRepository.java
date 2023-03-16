package ru.shik16.firstClass.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shik16.firstClass.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
