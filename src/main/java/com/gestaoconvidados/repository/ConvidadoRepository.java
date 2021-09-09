package com.gestaoconvidados.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestaoconvidados.model.Convidado;

@Repository
public interface ConvidadoRepository extends JpaRepository<Convidado, Long>{

}
