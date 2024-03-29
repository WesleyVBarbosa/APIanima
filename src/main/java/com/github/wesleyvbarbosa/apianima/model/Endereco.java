package com.github.wesleyvbarbosa.apianima.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Endereco {

    @Id
    @GeneratedValue
    private int id;

    private String rua;

    private String bairro;

    private String numero;

    private String complemento;

    private String cep;

    @Enumerated(EnumType.STRING)
    private UnidadeFederal uf;

}
