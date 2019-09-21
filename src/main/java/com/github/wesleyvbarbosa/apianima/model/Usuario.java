package com.github.wesleyvbarbosa.apianima.model;

import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;

@Entity
public class Usuario {

    @Id
    @GeneratedValue
    private int id;

    @Email
    private String email;

    private String senha;

    @ElementCollection
    private Set<PerfilUsuario> perfil;
}
