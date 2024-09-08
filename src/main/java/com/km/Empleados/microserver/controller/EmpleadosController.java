package com.km.Empleados.microserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.km.Empleados.microserver.entity.Empleados;
import com.km.Empleados.microserver.service.EmpleadosService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empleados")
public class EmpleadosController {
	
    @Autowired
    private EmpleadosService empleadosService;

    @PostMapping
    public ResponseEntity<Empleados> crearEmpleados(@RequestBody Empleados empleados) {
        Empleados nuevoEmpleados = empleadosService.crearEmpleados(empleados);
        return ResponseEntity.ok(nuevoEmpleados);
    }

    @GetMapping
    public ResponseEntity<List<Empleados>> obtenerTodosLosEmpleados() {
        List<Empleados> empleados = empleadosService.obtenerTodosLosEmpleados();
        return ResponseEntity.ok(empleados);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Empleados> obtenerEmpleadosPorId(@PathVariable String id) {
        Optional<Empleados> empleados = empleadosService.obtenerEmpleadosPorId(id);
        return empleados.map(ResponseEntity::ok)
                        .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Empleados> actualizarEmpleados(@PathVariable String id, @RequestBody Empleados empleados) {
        empleados.setId(id);
        Empleados empleadosActualizado = empleadosService.actualizarEmpleados(empleados);
        return ResponseEntity.ok(empleadosActualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarEmpleados(@PathVariable String id) {
        empleadosService.eliminarEmpleadosPorId(id);
        return ResponseEntity.noContent().build();
    }
}
