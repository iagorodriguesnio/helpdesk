package br.com.helpdesk.domain.enums;

public enum Status {

    ABERTO(1, "Aberto"), ANDAMENTO(2,"Andamento"), ENCERRADO(3, "Encerrado");

    private final Integer codStatus;
    private final String descricao;

    Status(Integer codStatus, String descricao) {
        this.codStatus = codStatus;
        this.descricao = descricao;
    }

    public Status toEnum(Integer codStatus) {
        if (codStatus == null){
            return null;
        }

        for (Status status : Status.values()){
            if (codStatus.equals(getCodStatus())){
                return status;
            }
        }

        throw new IllegalArgumentException("Código de Status Inválido.");
    }
    public Integer getCodStatus() {
        return codStatus;
    }

    public String getDescricao() {
        return descricao;
    }
}
