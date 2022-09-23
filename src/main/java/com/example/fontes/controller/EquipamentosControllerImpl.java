package com.example.fontes.controller;

import com.example.fontes.model.Equipamentos;
import com.example.fontes.service.EquipamentosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
   public Equipamentos inserirEquipamentos(Equipamentos equipamentos) {
      return null;
   }

   @Override
   public List<Equipamentos> encontrarTodosEquipamentos() {
      return null;
   }

   @Override
   public Equipamentos editarEquipamentos(Long id, Equipamentos equipamentos) {
      return null;
   }

   @Override
   public void apagarEquipamento(Long id) {

   }
}
