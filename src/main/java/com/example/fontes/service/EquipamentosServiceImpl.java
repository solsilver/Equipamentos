package com.example.fontes.service;

import com.example.fontes.model.Equipamentos;
import com.example.fontes.repository.EquipamentosRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class EquipamentosServiceImpl implements EquipamentosService {

    @Autowired
    private EquipamentosRepository equipamentosRepository;

    @Override

    public Optional<Equipamentos> encontrarPorId(Long id) {
        Optional<Equipamentos> e1 = equipamentosRepository.findById(id);
        return e1;
    }

    @Override
    public List<Equipamentos> encontrarTodos() {
        return null;
    }

    @Override
    public Equipamentos editarEquipamento(Long id, Equipamentos equipamentos) {
        Equipamentos e = equipamentosRepository.findById(id).get();
        if(e != null){
            if(equipamentos.getCodigo() != null)
                e.setCodigo(equipamentos.getCodigo());
            if(equipamentos.getNome() != null)
                e.setNome(equipamentos.getNome());
            if(equipamentos.getLocal() != null)
                e.setLocal(equipamentos.getLocal());
            if(equipamentos.getQuantidade() != null)
                e.setQuantidade(equipamentos.getQuantidade());
        }
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
