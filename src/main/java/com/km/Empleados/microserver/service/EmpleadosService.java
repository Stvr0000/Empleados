package com.km.Empleados.microserver.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.km.Empleados.microserver.entity.Empleados;
import com.km.Empleados.microserver.repository.EmpleadosRepository;

@Service
public class EmpleadosService {


    @Autowired
    private EmpleadosRepository empleadosRepository;

    public Empleados crearEmpleados(Empleados empleados) {
        return empleadosRepository.save(empleados);
    }

    public List<Empleados> obtenerTodosLosEmpleados() {
        return empleadosRepository.findAll();
    }

    public Optional<Empleados> obtenerEmpleadosPorId(String id) {
        return empleadosRepository.findById(id);
    }

    public Empleados actualizarEmpleados(Empleados empleados) {
        if (empleadosRepository.existsById(empleados.getId())) {
            return empleadosRepository.save(empleados);
        }
        return null;
    }

    public void eliminarEmpleadosPorId(String id) {
    	empleadosRepository.deleteById(id);
    }
}
