package com.paulasantana.demoGraphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.paulasantana.demoGraphql.resolver.Query;
import com.paulasantana.demoGraphql.resolver.Mutation;
import com.paulasantana.demoGraphql.respository.OfertaRepository;

@SpringBootApplication
public class DemoGraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoGraphqlApplication.class, args);
	}
	
	@Bean
	public Query query(@Autowired OfertaRepository ofertaRepository ){
		return new Query(ofertaRepository);
	}

	@Bean
	public Mutation mutation(@Autowired OfertaRepository ofertaRepository ){
		return new Mutation(ofertaRepository);
	}
}
