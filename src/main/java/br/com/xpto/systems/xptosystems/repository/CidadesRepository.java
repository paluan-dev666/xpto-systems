package br.com.xpto.systems.xptosystems.repository;

import br.com.xpto.systems.xptosystems.model.Cidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CidadesRepository extends JpaRepository<Cidades, Integer> {

    Optional<Cidades> findByIbgeId(int ibgeId);

    List<Cidades> findByCapitalTrue();
}
