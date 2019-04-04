package com.paulasantana.demoGraphql.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paulasantana.demoGraphql.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
