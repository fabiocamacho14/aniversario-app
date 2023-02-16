package com.fabio.aniversario.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TIPO_SER", discriminatorType = DiscriminatorType.STRING)
@Entity
public abstract class Ser extends EntidadeBaseInteger {

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "DESCRICAO")
    @Lob
    private String descricao;

    @Column(name = "IDADE", updatable = false, insertable = false)
    private Integer idade;

    @Column(name = "foto")
    @Lob
    private byte[] foto;
}
