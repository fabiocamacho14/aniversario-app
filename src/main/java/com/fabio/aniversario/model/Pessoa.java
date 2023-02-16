package com.fabio.aniversario.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@DiscriminatorValue("PESSOA")
public class Pessoa extends Ser {

//    Contador
    @Transient
    private LocalDate proximoAniversario;

//    Relacionamentos
    @OneToOne(mappedBy = "pessoa")
    private Aniversario aniversario;

    @ManyToMany
    @JoinTable(name = "PESSOA_GRUPO",
            joinColumns = @JoinColumn(name = "PESSOA_ID", nullable = false,
                    foreignKey = @ForeignKey(name = "FK_PESSOA_GRUPO_PESSOA")),
            inverseJoinColumns = @JoinColumn(name = "GRUPO_ID",
                    foreignKey = @ForeignKey(name = "FK_PESSOA_GRUPO_GRUPO")))
    private List<GrupoSocial> grupos;
}
