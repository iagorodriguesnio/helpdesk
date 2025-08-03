package br.com.helpdesk.domain.entity;

import br.com.helpdesk.domain.enums.Perfil;
import jakarta.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Tecnico extends Pessoa {

    private List<Chamado> chamados = new ArrayList<>();

    public Tecnico() {
        super();
    }
    public Tecnico(Integer Id, String nome, String cpf, String email, String senha) {
        super(Id, nome, cpf, email, senha);
        addPerfil(Perfil.TECNICO);
    }




    public List<Chamado> getChamados() {
        return chamados;
    }
    public void setChamados(List<Chamado> chamados) {
        this.chamados = chamados;
    }
}
