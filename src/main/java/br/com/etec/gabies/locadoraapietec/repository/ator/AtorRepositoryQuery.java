package br.com.etec.gabies.locadoraapietec.repository.ator;

import br.com.etec.gabies.locadoraapietec.model.Ator;
import br.com.etec.gabies.locadoraapietec.repository.filter.AtorFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AtorRepositoryQuery {

    public Page<Ator> filtrar(AtorFilter atorFilter, Pageable pageable)
}
