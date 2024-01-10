package com.mark.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mark.api.model.Lancamento;
import com.mark.api.repository.lancamento.LancamentoRepositoryQuery;



public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
