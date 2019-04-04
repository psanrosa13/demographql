package com.paulasantana.demoGraphql.resolver;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.paulasantana.demoGraphql.model.Oferta;
import com.paulasantana.demoGraphql.respository.OfertaRepository;

public class Query implements GraphQLQueryResolver{

	OfertaRepository ofertasRepository;
	
	public Query(OfertaRepository ofertasRepository) {
		this.ofertasRepository = ofertasRepository;
	}

	public List<Oferta> getObterOfertas() {
	       return ofertasRepository.findAll();
	}
	
	public Oferta getObterOfertasPorId(long id){
		return ofertasRepository.findById(id).get();
	}
	
}
