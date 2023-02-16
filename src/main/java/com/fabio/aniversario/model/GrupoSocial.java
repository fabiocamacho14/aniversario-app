package com.fabio.aniversario.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "GRUPO_SOCIAL")
public class GrupoSocial extends EntidadeBaseInteger {

    @Column(name = "NOME", length = 100, nullable = false)
    private String nome;

    @Column(name = "DESCRICAO")
    @Lob
    private String descricao;

    @Enumerated(EnumType.STRING)
    @Column(name = "NIVEL_IMPORTANCIA")
    private NivelImportancia nivelImportancia;

//    Relacionamentos
    @ManyToMany(mappedBy = "grupos")
    private List<Pessoa> pessoas;
}
