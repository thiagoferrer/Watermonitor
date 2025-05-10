package com.waterwatch.watermonitor.service;

import com.waterwatch.watermonitor.model.Medicao;
import com.waterwatch.watermonitor.repository.MedicaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicaoService {

    @Autowired
    private MedicaoRepository repository;

    public List<Medicao> listarTodas() {
        return repository.findAll();
    }

    public Optional<Medicao> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Medicao salvar(Medicao medicao) {
        return repository.save(medicao);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
