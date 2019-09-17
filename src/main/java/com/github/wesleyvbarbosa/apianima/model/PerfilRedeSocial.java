package com.github.wesleyvbarbosa.apianima.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PerfilRedeSocial {

    @Id
    @GeneratedValue
    private int id;

    private String url;

    @Enumerated(EnumType.STRING)
    private RedeSocial redeSocial;

    @ManyToOne
    private PessoaJuridica pessoaJuridica;
}
