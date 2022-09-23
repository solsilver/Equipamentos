package com.example.fontes.controller;

import com.example.fontes.model.Equipamentos;
import com.example.fontes.service.EquipamentosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
@Controller
public class EquipamentosControllerImpl implements EquipamentosController{

@Autowired
   EquipamentosServiceImpl equipamentosService;


   @Override
   @GetMapping(value = "/{id}")
   public Optional<Equipamentos> buscarEquipamentoPorId(Long id) {
      Optional<Equipamentos> e1 = equipamentosService.encontrarPorId(id);
      return e1;
   }

   @Override
   @PostMapping
   public Equipamentos inserirEquipamentos(Equipamentos equipamentos) {
      return equipamentosService.inserirEquipamento(equipamentos);
   }

   @Override
   @GetMapping
   public List<Equipamentos> encontrarTodosEquipamentos() {
      return equipamentosService.encontrarTodos();
   }

   @Override
   @PutMapping(value = "/{id}")
   public Equipamentos editarEquipamentos(Long id, Equipamentos equipamentos) {
      return equipamentosService.editarEquipamento(id, equipamentos);
   }

   @Override
   @DeleteMapping
   public void apagarEquipamento(Long id) {
   equipamentosService.retirarEquipamento(id);

   }
}
