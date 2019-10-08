package com.github.wesleyvbarbosa.apianima.form;

import com.github.wesleyvbarbosa.apianima.model.Usuario;

public class UsuarioForm {

    private String email;
    private String senha;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario converterParaEntidade(UsuarioForm form){
       return new Usuario(form);
    }

}
