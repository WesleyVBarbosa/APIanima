package com.github.wesleyvbarbosa.apianima.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class RedeSocial {

    @Id
    @GeneratedValue
    private int id;

    private String descricao;

    private String url;

    @ManyToMany
    @JoinTable(name = "empresa_rede_social",
        joinColumns = {@JoinColumn(name = "rede_social_id")}, inverseJoinColumns = {@JoinColumn(name = "empresa_id")})
    private List<Empresa> empresas;
}
