package com.github.wesleyvbarbosa.apianima.model;

import com.github.wesleyvbarbosa.apianima.form.UsuarioForm;

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

    public Usuario(){}

    public Usuario(UsuarioForm form) {
        this.email = form.getEmail();
        this.senha = form.getSenha();
    }
}
