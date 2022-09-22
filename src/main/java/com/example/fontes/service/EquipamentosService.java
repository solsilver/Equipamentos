package com.example.fontes.service;

import com.example.fontes.model.Equipamentos;

import java.util.List;

public interface EquipamentosService {
    public Equipamentos encontrarPorId(Long id);

    public List<Equipamentos> encontrarTodos();

    public Equipamentos editarEquipamento(Long id, Equipamentos equipamentos);

    public Equipamentos inserirEquipamento(Equipamentos equipamentos);

    public void retirarEquipamento(Long id);

}