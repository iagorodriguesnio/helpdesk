package br.com.helpdesk.domain.enums;

public enum Prioridade {

    BAIXA(0, "Baixa"), MEDIA(1,"Média"), ALTA(2, "Alta");

    private final Integer codPrioridade;
    private final String descricao;

    Prioridade(Integer codPrioridade, String descricao) {
        this.codPrioridade = codPrioridade;
        this.descricao = descricao;
    }

    public Prioridade toEnum(Integer codPrioridade) {
        if (codPrioridade == null){
            return null;
        }

        for (Prioridade prioridade : Prioridade.values()){
            if (codPrioridade.equals(getCodPrioridade())){
                return prioridade;
            }
        }

        throw new IllegalArgumentException("Código de Prioridade Inválido.");
    }
    public Integer getCodPrioridade() {
        return codPrioridade;
    }

    public String getDescricao() {
        return descricao;
    }
}
