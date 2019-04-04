package com.paulasantana.demoGraphql.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paulasantana.demoGraphql.model.Loja;

@Repository
public interface LojaRepository extends JpaRepository<Loja, Long>{

}
