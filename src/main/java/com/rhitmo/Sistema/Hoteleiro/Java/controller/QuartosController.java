package com.rhitmo.Sistema.Hoteleiro.Java.controller;

import com.rhitmo.Sistema.Hoteleiro.Java.entities.Quartos;
import com.rhitmo.Sistema.Hoteleiro.Java.repositories.QuartosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hotel")
public class QuartosController {

    @Autowired
    private QuartosRepository quartosRepository;

    @GetMapping(value = "/consultarTodosOsQuartos")
    public List<Quartos> consultarTodosOsQuartos() {
        return quartosRepository.findAll();
    }

    @GetMapping(value = "/consultarQuartosDisponiveis")
    public List<Quartos> consultarQuartosDisponiveis(@PathVariable("disponibilidade") String disponibilidade) {
        return quartosRepository.findByDisponibilidade(disponibilidade);
    }

    @DeleteMapping("/{id}")
    public void deletaAtletaPorID(@PathVariable Long id) {
        quartosRepository.deleteById(id);
    }

}
