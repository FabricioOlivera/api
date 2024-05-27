package com.example.crudapi.entity;

import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_empleado")
public class empleado {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long employeId;
  private String firstName;
  private String secondName;
  private Date born;
  
}
