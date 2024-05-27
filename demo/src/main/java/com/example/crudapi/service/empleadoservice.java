package com.example.crudapi.service;

import java.util.Optional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.crudapi.repository.repositorioEmpleado;
import com.example.crudapi.entity.empleado;
@Service
public class empleadoservice {
  @Autowired
  repositorioEmpleado employeRepository;
 public List<empleado> getEmployes(){
    return employeRepository.findAll();
 } 
 
 public Optional<empleado> getOneEmployee(Long id){

   return employeRepository.findById(id);
 }
 public void saveOrUpdate(empleado employee){

   employeRepository.save(employee);
 }

 public void delete(Long id){

     employeRepository.deleteById(id);

 }
}
