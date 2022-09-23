package com.example.fontes.controller;

import com.example.fontes.model.Equipamentos;
import com.example.fontes.service.EquipamentosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@Controller
public class EquipamentosControllerImpl implements EquipamentosController{

@Autowired
   EquipamentosServiceImpl equipamentosService;


   @Override
   public Equipamentos buscarEquipamentoPorId(Long id) {
      return null;
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
   public Equipamentos editarEquipamentos(Long id, Equipamentos equipamentos) {
      return null;
   }

   @Override
   @DeleteMapping
   public void apagarEquipamento(Long id) {
   equipamentosService.retirarEquipamento(id);

   }
}
