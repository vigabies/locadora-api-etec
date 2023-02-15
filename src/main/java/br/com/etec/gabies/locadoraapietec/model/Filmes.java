package br.com.etec.gabies.locadoraapietec.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="filmes")

public class Filmes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nomeFilme;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Filmes filmes = (Filmes) o;
        return id.equals(filmes.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
