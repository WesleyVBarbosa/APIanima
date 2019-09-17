package com.github.wesleyvbarbosa.apianima.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Usuario {

    @Id
    @GeneratedValue
    private int id;

    private String nome;

    private String sobrenome;

    private String usuario;

    private boolean status;

    private String email;

    private String senha;

    private boolean usuarioCorporativo;

    private boolean usuarioAdminEmpresa;

}
