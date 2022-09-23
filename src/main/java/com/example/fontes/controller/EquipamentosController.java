package com.example.fontes.controller;

import com.example.fontes.model.Equipamentos;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface EquipamentosController {
    public Optional<Equipamentos> buscarEquipamentoPorId(Long id);

    public Equipamentos inserirEquipamentos(Equipamentos equipamentos);

    public List<Equipamentos> encontrarTodosEquipamentos();

    public Equipamentos editarEquipamentos(Long id, Equipamentos equipamentos);

    public void apagarEquipamento(Long id);


}
