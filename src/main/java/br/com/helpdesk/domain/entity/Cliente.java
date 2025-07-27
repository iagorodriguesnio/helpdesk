package br.com.helpdesk.domain.entity;

import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{

    private List<Chamado> chamados = new ArrayList<>();
    public Cliente(@NonNull Integer Id, @NonNull String nome, @NonNull String cpf, @NonNull String email, @NonNull String senha) {
        super(Id, nome, cpf, email, senha);
    }

    public List<Chamado> getChamados() {
        return chamados;
    }

    public void setChamados(List<Chamado> chamados) {
        this.chamados = chamados;
    }

}
