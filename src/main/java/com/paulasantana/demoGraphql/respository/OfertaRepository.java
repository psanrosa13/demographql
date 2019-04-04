package com.paulasantana.demoGraphql.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paulasantana.demoGraphql.model.Oferta;

@Repository
public interface OfertaRepository extends JpaRepository<Oferta, Long>{

	
	
}
