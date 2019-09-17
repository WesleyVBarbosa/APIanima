package com.github.wesleyvbarbosa.apianima.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Endereco {

    @Id
    @GeneratedValue
    private int id;

    private String rua;

    private String bairro;

    private int numeroLocatario;

    private String complemento;

    private String cep;

    private String uf;

}
