package com.example.demo.repository;

import com.example.demo.model.PinCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PipncodeRepository extends JpaRepository<PinCode, Integer> {

}
