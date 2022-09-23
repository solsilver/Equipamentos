package com.example.fontes.service;

import com.example.fontes.model.Equipamentos;
import com.example.fontes.repository.EquipamentosRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EquipamentosServiceImpl implements EquipamentosService {
    @Autowired
    private EquipamentosRepository equipamentosRepository;
    @Override

    public Equipamentos encontrarPorId(Long id) {

        return null;
    }

    @Override
    public List<Equipamentos> encontrarTodos() {
        return null;
    }

    @Override
    public Equipamentos editarEquipamento(Long id, Equipamentos equipamentos) {
        return null;
    }

    @Override
    public Equipamentos inserirEquipamento(Equipamentos equipamentos) {
        return null;
    }

    @Override
    public void retirarEquipamento(Long id) {

    }
}
