package com.paulasantana.demoGraphql.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.paulasantana.demoGraphql.model.Oferta;
import com.paulasantana.demoGraphql.respository.OfertaRepository;

public class Mutation implements GraphQLMutationResolver{
	
	OfertaRepository ofertaRepository;
	
	 public Mutation(OfertaRepository ofertaRepository) {
		this.ofertaRepository = ofertaRepository;
	}

	public Oferta novaOferta(double valor, long idLoja) {
	        return ofertaRepository.adcionarOferta(valor, idLoja);
	 }

}
