package com.mark.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.mark.api.model.Pessoa;
import com.mark.api.repository.pessoa.PessoaRepositoryQuery;




public interface PessoaRepository extends JpaRepository<Pessoa, Long>, PessoaRepositoryQuery {



}