package com.github.wesleyvbarbosa.apianima.model;

import java.io.File;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class PessoaJuridica {

    @Id
    private int id;

    @MapsId
    @OneToOne
    private Usuario usuario;

    private String razaoSocial;

    private String nomeFantasia;

    private Long cnpj;

    // FIXME: AWS S3
    @ElementCollection
    private Set<File> imagens;

    @OneToOne
    private Endereco endereco;

    @OneToMany(mappedBy = "pessoaJuridica")
    private Set<PerfilRedeSocial> redesSociais;

    @OneToMany(mappedBy = "pessoaJuridica")
    private Set<Contato> contatos;
}
