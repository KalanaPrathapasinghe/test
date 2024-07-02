package com.test.repository;

import com.test.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentsRepository extends JpaRepository<Students ,Long> {

    List<Students> findByStatus(int status);
    Students findByStudentIdAndStatus(long studentId, int status);
}
