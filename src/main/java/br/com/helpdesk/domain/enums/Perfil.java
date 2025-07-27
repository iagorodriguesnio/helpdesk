package br.com.helpdesk.domain.enums;

public enum Perfil {

    ADMIN(0, "Role_Admin"), CLIENTE(1,"Role_Cliente"), TECNICO(2, "Role_Tecnico");

    private final Integer codPerfil;
    private final String descricao;

    Perfil(Integer codPerfil, String descricao) {
        this.codPerfil = codPerfil;
        this.descricao = descricao;
    }

    public static Perfil toEnum(Integer codPerfil) {
        if (codPerfil == null){
            return null;
        }

        for (Perfil perfil : Perfil.values()){
            if (codPerfil.equals(perfil.getCodPerfil())){
                return perfil;
            }
        }

        throw new IllegalArgumentException("Código de Perfil Inválido.");
    }
    public Integer getCodPerfil() {
        return codPerfil;
    }

    public String getDescricao() {
        return descricao;
    }
}
