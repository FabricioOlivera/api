package com.example.crudapi.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;
import com.example.crudapi.entity.empleado;
import com.example.crudapi.service.empleadoservice;

@RestController
@RequestMapping(path = "api/v1/employes")
public class empleadocontroller {
    @Autowired
    private  empleadoservice employeService;
    @GetMapping
    public List<empleado> getAll(){
        return  employeService.getEmployes();
    }

    @GetMapping("/{employeId}")
    public Optional <empleado> getById(@PathVariable("employeId") Long employeId){
        return  employeService.getOneEmployee(employeId);
    }
    
    @PostMapping
    public empleado saveUpdate(@RequestBody empleado employee){
      employeService.saveOrUpdate(employee);
      return employee;
    }
    
    @DeleteMapping("/{employeId}")
    public void delete(@PathVariable("employeId") Long employeId){
      employeService.delete(employeId);
    }
}
