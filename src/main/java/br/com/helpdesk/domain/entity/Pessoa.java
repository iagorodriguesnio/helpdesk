package br.com.helpdesk.domain.entity;

import br.com.helpdesk.domain.enums.Perfil;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public abstract  class Pessoa {

    @EqualsAndHashCode.Include
    @NonNull //irá para o construtor
    protected Integer Id;
    @NonNull
    protected String nome;
    @EqualsAndHashCode.Include
    @NonNull
    protected String cpf;
    @NonNull
    protected String email;
    @NonNull
    protected String senha;

    @Setter(AccessLevel.NONE)//remove o setter
    protected Set<Integer> perfis = new HashSet<>();

    @Setter(AccessLevel.NONE)
    protected LocalDate dataCriação = LocalDate.now();

    public Set<Perfil> getPerfis() {
        return this.perfis.stream().map(Perfil::toEnum).collect(Collectors.toSet());
    }

    public void addPerfil(Perfil perfil) {
        this.perfis.add(perfil.getCodPerfil());
    }
}
