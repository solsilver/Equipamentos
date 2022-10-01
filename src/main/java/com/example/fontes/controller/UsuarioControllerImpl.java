package com.example.fontes.controller;

import com.example.fontes.model.Usuario;
import com.example.fontes.model.dto.UsuarioResponseDto;
import com.example.fontes.service.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/usuario")
@Controller
public class UsuarioControllerImpl {

@Autowired
   UsuarioServiceImpl usuarioService;



   @GetMapping(value = "/{id}")
   public ResponseEntity<UsuarioResponseDto> buscarEquipamentoPorId(@PathVariable("id") Long id) {
      UsuarioResponseDto e1 = usuarioService.encontrarPorId(id);

      return ResponseEntity.ok().body(e1);
   }


   @PostMapping
   public ResponseEntity<Usuario> inserirUsuario(@RequestBody @Valid Usuario usuario) {
      return ResponseEntity.ok().body(usuarioService.inserirUsuario(usuario));
   }


   @GetMapping
   public ResponseEntity<List<Usuario>> encontrarTodosUsuario() {

      return ResponseEntity.ok().body(usuarioService.encontrarTodos());
   }


   @PutMapping(value = "/{id}")
   public ResponseEntity<Usuario> editarUsuario(@PathVariable("id") Long id, @RequestBody Usuario usuario) {
      return ResponseEntity.ok().body(usuarioService.editarUsuario(id, usuario));
   }


   @DeleteMapping(value = "/{id}")
   public ResponseEntity<?> apagarEquipamento(@PathVariable("id") Long id) {
      usuarioService.retirarUsuario(id);
      return ResponseEntity.noContent().build();
   }
}
