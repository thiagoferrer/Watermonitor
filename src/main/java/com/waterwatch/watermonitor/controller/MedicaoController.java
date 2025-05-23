package com.waterwatch.watermonitor.controller;

import com.waterwatch.watermonitor.model.Medicao;
import com.waterwatch.watermonitor.service.MedicaoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medicoes")
public class MedicaoController {

    @Autowired
    private MedicaoService service;

    @PostMapping
    public Medicao salvar(@Valid @RequestBody Medicao medicao) {
        return service.salvar(medicao);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medicao> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Medicao> listarTodos() {
        return service.listarTodas(); // Mudar para listarTodas()
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}