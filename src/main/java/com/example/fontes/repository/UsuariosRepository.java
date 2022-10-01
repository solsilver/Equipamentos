package com.example.fontes.repository;

import com.example.fontes.model.Equipamentos;
import com.example.fontes.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuario, Long> {


}
