package com.paulasantana.demoGraphql.respository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.paulasantana.demoGraphql.model.Loja;
import com.paulasantana.demoGraphql.model.Oferta;

@Repository
public class OfertaRepository{

	public List<Oferta> getOfertas(){
		Oferta oferta1= new Oferta(1l,120.90,new Loja(2l,"Armarinhos Fernandes"));
		Oferta oferta2= new Oferta(2l,133.00,new Loja(5l,"Palmari Armarinhos"));
		List<Oferta> ofertas = new ArrayList<>();
		ofertas.add(oferta1);
		ofertas.add(oferta2);

		return ofertas;
	}

	public List<Oferta> getOfertasPorProduto(long id) {
		Oferta oferta1= new Oferta(1l,120.90,new Loja(2l,"Armarinhos Fernandes"));
		List<Oferta> ofertas = new ArrayList<>();
		ofertas.add(oferta1);
		
		return ofertas;
	}

	public Oferta adcionarOferta(double valor, long idLoja) {
		return new Oferta(10l,valor,new Loja(idLoja,"Armarinhos Fernandes"));
	}
	
}
