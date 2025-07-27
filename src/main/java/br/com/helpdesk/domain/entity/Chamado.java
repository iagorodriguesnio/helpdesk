package br.com.helpdesk.domain.entity;

import br.com.helpdesk.domain.enums.Prioridade;
import br.com.helpdesk.domain.enums.Status;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Chamado {
    @NonNull
    @EqualsAndHashCode.Include
    private Integer Id;
    private LocalDateTime dataAbertura = LocalDateTime.now();
    private LocalDateTime dataFechamento;
    @NonNull
    private Prioridade prioridade;
    @NonNull
    private Status status;
    @NonNull
    private String titulo;
    @NonNull
    private String observacao;
    @NonNull
    private Cliente cliente;
    @NonNull
    private Tecnico tecnico;

}
