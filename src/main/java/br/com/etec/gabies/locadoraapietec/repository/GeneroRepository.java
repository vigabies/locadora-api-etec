package br.com.etec.gabies.locadoraapietec.repository;

import br.com.etec.gabies.locadoraapietec.model.Genero;
import br.com.etec.gabies.locadoraapietec.repository.genero.GeneroRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Integer>, GeneroRepositoryQuery {

}
