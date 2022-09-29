package com.example.fontes.repository;

import com.example.fontes.model.Equipamentos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipamentosRepository extends JpaRepository<Equipamentos, Long> {

    Equipamentos findByLocalAndCodigo(String local, String codigo);
}
