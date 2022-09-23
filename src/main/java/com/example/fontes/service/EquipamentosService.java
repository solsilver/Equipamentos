package com.example.fontes.service;

import com.example.fontes.model.Equipamentos;

import java.util.List;
import java.util.Optional;

public interface EquipamentosService {
    public Optional<Equipamentos> encontrarPorId(Long id);

    public List<Equipamentos> encontrarTodos();

    public Equipamentos editarEquipamento(Long id, Equipamentos equipamentos);

    public Equipamentos inserirEquipamento(Equipamentos equipamentos);

    public void retirarEquipamento(Long id);

}