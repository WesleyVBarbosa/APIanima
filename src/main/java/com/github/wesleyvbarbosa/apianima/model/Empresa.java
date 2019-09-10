package com.github.wesleyvbarbosa.apianima.model;

import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Empresa {

    private int id;
    private String razaoSocial;
    private String cnpj;
    private String emailContato;
    private Set<String> telefonesContato;
    private Set<Usuario> usuarios;
    private String descricao;
    private LinkedHashSet<File> imagens;
    private List<Endereco> enderecos;
    private Set<RedeSocial> redesSociais;


}
