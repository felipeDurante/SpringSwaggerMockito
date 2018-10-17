package io.swagger.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Service;

import io.swagger.model.PdvEntity;
import io.swagger.service.PdvService;

@Service
public class PdvServiceImpl implements PdvService {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<PdvEntity> getThenPdv() {
		TypedQuery<PdvEntity> query = em.createQuery("pdv from PdvEntity pdv", PdvEntity.class);
		query.setMaxResults(10);
		List<PdvEntity> lista = query.getResultList();
		return lista;
	}

}
