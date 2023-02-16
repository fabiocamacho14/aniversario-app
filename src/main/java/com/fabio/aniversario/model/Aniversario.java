package com.fabio.aniversario.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "ANIVERSARIO")
public class Aniversario extends EntidadeBaseInteger {

    @Column(name = "DATA_ANIVERSARIO", nullable = false)
    private LocalDate dataAniversario;

//    Relacionamentos

    @OneToOne(optional = false, fetch = FetchType.EAGER)
    @MapsId
    @JoinColumn(name = "ID_PESSOA", nullable = false, foreignKey = @ForeignKey(name = "FK_ANIVERSARIO_PESSOA"))
    private Pessoa pessoa;
}
