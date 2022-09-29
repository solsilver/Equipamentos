package com.example.fontes.controller;

import com.example.fontes.model.Equipamentos;
import com.example.fontes.service.EquipamentosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/inventario")
@Controller
public class EquipamentosControllerImpl implements EquipamentosController{

@Autowired
   EquipamentosServiceImpl equipamentosService;


   @Override
   @GetMapping(value = "/{id}")
   public ResponseEntity<Equipamentos> buscarEquipamentoPorId(@PathVariable("id") Long id) {
      Equipamentos e1 = equipamentosService.encontrarPorId(id);

      return ResponseEntity.ok().body(e1);
   }

   @Override
   @PostMapping
   public ResponseEntity<Equipamentos> inserirEquipamentos(@RequestBody Equipamentos equipamentos) {
      return ResponseEntity.ok().body(equipamentosService.inserirEquipamento(equipamentos));
   }

   @Override
   @GetMapping
   public ResponseEntity<List<Equipamentos>> encontrarTodosEquipamentos() {

      return ResponseEntity.ok().body(equipamentosService.encontrarTodos());
   }

   @Override
   @PutMapping(value = "/{id}")
   public ResponseEntity<Equipamentos> editarEquipamentos(@PathVariable("id") Long id, @RequestBody Equipamentos equipamentos) {
      return ResponseEntity.ok().body(equipamentosService.editarEquipamento(id, equipamentos));
   }

   @Override
   @DeleteMapping(value = "/{id}")
   public ResponseEntity<?> apagarEquipamento(@PathVariable("id") Long id) {
      equipamentosService.retirarEquipamento(id);
      return ResponseEntity.noContent().build();
   }
}
