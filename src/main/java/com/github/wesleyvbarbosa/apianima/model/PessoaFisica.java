package com.github.wesleyvbarbosa.apianima.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;

@Entity
public class PessoaFisica {

    @Id
    private int id;

    @MapsId
    @OneToOne
    private Usuario usuario;

    @NotEmpty
    private String nome;

    private String apelido;
}
