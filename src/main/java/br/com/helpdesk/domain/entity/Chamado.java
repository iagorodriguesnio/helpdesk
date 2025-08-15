package br.com.helpdesk.domain.entity;

import br.com.helpdesk.domain.enums.Prioridade;
import br.com.helpdesk.domain.enums.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;


@Entity(name = "tb_chamados")
public class Chamado implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDateTime dataAbertura = LocalDateTime.now();
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDateTime dataFechamento;

    private Prioridade prioridade;
    private Status status;
    private String titulo;

    private String observacao;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "tecnico_id")
    private Tecnico tecnico;


    public Chamado(Integer id, Prioridade prioridade, Status status, String titulo, String observacao, Cliente cliente, Tecnico tecnico) {
        Id = id;
        this.prioridade = prioridade;
        this.status = status;
        this.titulo = titulo;
        this.observacao = observacao;
        this.cliente = cliente;
        this.tecnico = tecnico;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Chamado chamado = (Chamado) o;
        return Objects.equals(Id, chamado.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Id);
    }
}
