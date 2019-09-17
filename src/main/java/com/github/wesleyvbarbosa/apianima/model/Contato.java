package com.github.wesleyvbarbosa.apianima.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Contato {

    @Id
    @GeneratedValue
    private int id;

    private TipoContato tipo;

    private String valor;

    @ManyToOne
    private PessoaJuridica pessoaJuridica;
}
