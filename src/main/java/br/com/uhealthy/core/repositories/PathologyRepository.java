package br.com.uhealthy.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.uhealthy.core.models.Pathology;

public interface PathologyRepository extends JpaRepository<Pathology, Long>{

}
