package com.fabio.aniversario.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "aniversario")
public class Aniversario extends EntidadeBaseInteger {

    @Column(length = 100, nullable = false)
    private String nome;
}
