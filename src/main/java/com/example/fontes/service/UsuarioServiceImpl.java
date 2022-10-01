package com.example.fontes.service;

import com.example.fontes.controller.excecao.ObjectNotFoundException;
import com.example.fontes.model.Usuario;
import com.example.fontes.model.dto.UsuarioResponseDto;
import com.example.fontes.repository.UsuariosRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl {

    @Autowired
    private UsuariosRepository usuarioRepository;
    @Autowired
    private ModelMapper modelMapper;


    public UsuarioResponseDto encontrarPorId(Long id) {
        Usuario e1 = usuarioRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("nao encontramos o equipamento"));

        return modelMapper.map(e1,UsuarioResponseDto.class) ;
    }

    public List<Usuario> encontrarTodos() {
        List<Usuario> Usuario = usuarioRepository.findAll();
        return Usuario;
    }

    public Usuario editarUsuario(Long id, Usuario Usuario) {
        Usuario e = usuarioRepository.findById(id).get();

        return usuarioRepository.save(e);
    }

    public Usuario inserirUsuario(Usuario Usuario) {
        Usuario e = usuarioRepository.save(Usuario);
        return e;
    }

    public void retirarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}
