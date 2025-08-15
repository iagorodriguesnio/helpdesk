package br.com.helpdesk.domain.entity;

import br.com.helpdesk.domain.enums.Perfil;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Tecnico extends Pessoa {

    @OneToMany(mappedBy = "tecnico")
    private List<Chamado> chamados = new ArrayList<>();

    public Tecnico() {
        super();
        addPerfil(Perfil.TECNICO);
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
