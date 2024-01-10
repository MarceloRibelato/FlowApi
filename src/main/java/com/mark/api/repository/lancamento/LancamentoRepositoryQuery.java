package com.mark.api.repository.lancamento;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mark.api.model.Lancamento;
import com.mark.api.repository.filter.LancamentoFilter;
import com.mark.api.repository.projection.ResumoLancamento;

public interface LancamentoRepositoryQuery    {
	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);
}
