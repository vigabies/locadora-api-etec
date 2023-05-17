package br.com.etec.gabies.locadoraapietec.repository.filmes;

import br.com.etec.gabies.locadoraapietec.model.Filmes;
import br.com.etec.gabies.locadoraapietec.repository.filter.FilmesFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FilmesRepositoryQuery {

    public Page<Filmes> filtrar(FilmesFilter filmesFilter, Pageable pageable);
}
