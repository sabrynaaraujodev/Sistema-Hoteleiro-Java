package com.rhitmo.Sistema.Hoteleiro.Java.repositories;

import com.rhitmo.Sistema.Hoteleiro.Java.entities.Quartos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuartosRepository extends JpaRepository<Quartos, Integer> {

    List<Quartos> findAll();

    List<Quartos> findByDisponibilidade(String disponibilidade);

     void deleteById(Long idQuarto);

//     void alterarById(Long id);

}
