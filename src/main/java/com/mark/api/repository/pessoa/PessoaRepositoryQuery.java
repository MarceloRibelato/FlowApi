package com.mark.api.repository.pessoa;

import java.util.List;

import com.mark.api.model.Pessoa;
import com.mark.api.repository.filter.PessoaFilter;

public interface PessoaRepositoryQuery {
	
	public List <Pessoa> filtrar(PessoaFilter pessoaFilter);

}
