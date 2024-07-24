package com.example.crudwithspring;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IstudentRepository extends JpaRepository<Student,Long> {

}
