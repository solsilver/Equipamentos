package com.example.fontes.controller;

import com.example.fontes.model.Equipamentos;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EquipamentosController {
    public ResponseEntity<Equipamentos> buscarEquipamentoPorId(Long id);

    public ResponseEntity<Equipamentos> inserirEquipamentos(Equipamentos equipamentos);

    public ResponseEntity<List<Equipamentos>> encontrarTodosEquipamentos();

    public ResponseEntity<Equipamentos> editarEquipamentos(Long id, Equipamentos equipamentos);

    public ResponseEntity<?> apagarEquipamento(Long id);


}
