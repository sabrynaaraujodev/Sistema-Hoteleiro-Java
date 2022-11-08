package com.rhitmo.Sistema.Hoteleiro.Java.entities;


import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Component
@Entity
@Table(name = "quartos")
public class Quartos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "disponibilidade")
    private String disponibilidade;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "valor")
    private String valor;

    public Quartos(Long id, String disponibilidade, String descricao, String valor) {
        this.id = id;
        this.disponibilidade = disponibilidade;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Quartos() {
    }

    @Override
    public String toString() {
        return "Quartos{" +
                "id_quarto=" + id +
                ", disponibilidade='" + disponibilidade + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor='" + valor + '\'' +
                '}';
    }
}
