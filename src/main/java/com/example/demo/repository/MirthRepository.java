package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Mirth;

@Repository
public interface MirthRepository extends JpaRepository<Mirth, Integer> {

}