package com.example.fontes.controller;

import com.example.fontes.model.Equipamentos;
import com.example.fontes.service.EquipamentosServiceImpl;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface EquipamentosController {
    public Equipamentos buscarEquipamentoPorId(@PathVariable("id") Long id);
    public Equipamentos inserirEquipamentos(@RequestBody Equipamentos equipamentos);

    public List<Equipamentos> encontrarTodosEquipamentos();

    public Equipamentos editarEquipamentos(@PathVariable("id") Long id , @RequestBody Equipamentos equipamentos);

    public void apagarEquipamento(@PathVariable("id") Long id);

}
