package com.example.crudapi.repository;

import com.example.crudapi.entity.empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositorioEmpleado extends JpaRepository<empleado, Long>{

}
