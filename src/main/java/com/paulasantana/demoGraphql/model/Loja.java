package com.paulasantana.demoGraphql.model;

public class Loja {

	private Long id;
	private String nome;
	
	public Loja(long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
