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
	       return ofertasRepository.getOfertas();
	}
	
	public List<Oferta> getObterOfertasPorIdProduto(long id){
		return ofertasRepository.getOfertasPorProduto(id);
	}
	
}
