package io.swagger.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.swagger.model.PdvEntity;

@Repository
public interface PdvRepository extends CrudRepository<PdvEntity, Long> {

	Iterable<PdvRepository> findByCdDddRegiao(String dddRegiao);
	
	
}
