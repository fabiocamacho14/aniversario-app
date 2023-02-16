package com.fabio.aniversario.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Getter
@Setter
@Entity
@DiscriminatorValue("PET")
public class Pet extends Ser {

    @Column(name = "RACA", length = 100)
    private String raca;
}
