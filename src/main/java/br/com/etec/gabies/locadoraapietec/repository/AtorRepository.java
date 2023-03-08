package br.com.etec.gabies.locadoraapietec.repository;

import br.com.etec.gabies.locadoraapietec.model.Ator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtorRepository extends JpaRepository<Ator, Integer> {
}
