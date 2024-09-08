package com.km.Empleados.microserver.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.km.Empleados.microserver.entity.Empleados;


public interface EmpleadosRepository extends MongoRepository<Empleados, String> {

}
