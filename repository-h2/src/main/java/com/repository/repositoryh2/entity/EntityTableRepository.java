package com.repository.repositoryh2.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityTableRepository extends JpaRepository<UserEntityTable, Long>{

	List<UserEntityTable> findByNombre(String nombre);
}
