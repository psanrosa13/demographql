package com.paulasantana.demoGraphql.model;

public class Oferta {

	private Long id;
	private Double valor;
	private Loja loja;
	
	public Oferta(long id, double valor, Loja loja) {
		this.id = id;
		this.valor = valor;
		this.loja = loja;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Loja getLoja() {
		return loja;
	}
	public void setLoja(Loja loja) {
		this.loja = loja;
	}
	
	
}
