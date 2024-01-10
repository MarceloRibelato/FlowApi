package com.mark.api.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import com.mark.api.model.Lancamento;
import com.mark.api.model.Pessoa;
import com.mark.api.repository.LancamentoRepository;
import com.mark.api.repository.PessoaRepository;
import com.mark.api.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {

	@Autowired
	private LancamentoRepository lancamentoRepository;

	@Autowired
	private PessoaRepository pessoaRepository;

	public Lancamento atualizar(Long codigo, Lancamento lancamento) {
		Lancamento lancamentoSalvo = buscarLancamentoPeloCodigo(codigo);
		validarPessoa(lancamento);
		BeanUtils.copyProperties(lancamento, lancamentoSalvo, "codigo");
		return lancamentoRepository.save(lancamentoSalvo);
	}

	private void validarPessoa(Lancamento lancamento) {
		if (lancamento.getPessoa().getCodigo() != null) {
			Pessoa pessoa = pessoaRepository.findById(lancamento.getPessoa().getCodigo())
					.orElseThrow(PessoaInexistenteOuInativaException::new);

			if (pessoa.isInativo()) {
				throw new PessoaInexistenteOuInativaException();
			}
		}
	}

	private Lancamento buscarLancamentoPeloCodigo(Long codigo) {
		return lancamentoRepository.findById(codigo)
				.orElseThrow(() -> new EmptyResultDataAccessException(1));
	}

	public Lancamento salvar(Lancamento lancamento) {
		validarPessoa(lancamento);
		return lancamentoRepository.save(lancamento);
	}

	private Lancamento buscarLancamentoExistente(Long codigo) {
		return lancamentoRepository.findById(codigo)
				.orElseThrow(IllegalArgumentException::new);
	}
}
