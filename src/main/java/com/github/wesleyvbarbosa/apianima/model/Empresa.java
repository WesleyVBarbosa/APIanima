package com.github.wesleyvbarbosa.apianima.model;

import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Empresa {

    @Id
    @GeneratedValue
    private int id;

    private String razaoSocial;

    private String cnpj;

    private String emailContato;

    private LinkedHashSet<String> telefonesContato;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id")
    private List<Usuario> usuarios;

    private String descricao;

    private LinkedHashSet<File> imagens;

    @ManyToMany
    @JoinTable(name = "empresas_enderecos",
        joinColumns = {@JoinColumn(name = "empresa_id")}, inverseJoinColumns = {@JoinColumn(name = "endereco_id")})
    private List<Endereco> enderecos;

    @ManyToMany(mappedBy = "empresas")
    private List<RedeSocial> redesSociais;


}
