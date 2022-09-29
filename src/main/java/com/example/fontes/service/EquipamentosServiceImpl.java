package com.example.fontes.service;

import com.example.fontes.controller.excecao.DuplicatedObjectException;
import com.example.fontes.controller.excecao.ObjectNotFoundException;
import com.example.fontes.model.Equipamentos;
import com.example.fontes.repository.EquipamentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipamentosServiceImpl implements EquipamentosService {

    @Autowired
    private EquipamentosRepository equipamentosRepository;

    @Override

    public Equipamentos encontrarPorId(Long id) {
        Equipamentos e1 = equipamentosRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("nao encontramos o equipamento"));
        return e1;
    }

    @Override
    public List<Equipamentos> encontrarTodos() {
        List<Equipamentos> equipamentos = equipamentosRepository.findAll();
        return equipamentos;
    }

    @Override
    public Equipamentos editarEquipamento(Long id, Equipamentos equipamentos) {
        Equipamentos e = equipamentosRepository.findById(id).get();
        if (e != null) {
            if (equipamentos.getCodigo() != null)
                e.setCodigo(equipamentos.getCodigo());
            if (equipamentos.getNome() != null)
                e.setNome(equipamentos.getNome());
            if (equipamentos.getLocal() != null)
                e.setLocal(equipamentos.getLocal());
            if (equipamentos.getQuantidade() != null)
                e.setQuantidade(equipamentos.getQuantidade());
        }
        return equipamentosRepository.save(e);
    }

    @Override
    public Equipamentos inserirEquipamento(Equipamentos equipamentos) {
        Equipamentos obj = equipamentosRepository.findByLocalAndCodigo(equipamentos.getLocal(), equipamentos.getCodigo());
        if (obj != null) {
            throw new DuplicatedObjectException("ja existe no sistema e na bancada");
        }

        Equipamentos e = equipamentosRepository.save(equipamentos);
        return e;
    }

    @Override
    public void retirarEquipamento(Long id) {
        equipamentosRepository.deleteById(id);
    }
}
