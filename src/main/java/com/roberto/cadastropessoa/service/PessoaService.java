package com.roberto.cadastropessoa.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.roberto.cadastropessoa.model.Pessoa;
import com.roberto.cadastropessoa.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;

	public Pessoa findById(Long id) {
		Optional<Pessoa> obj = pessoaRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pessoa.class.getName(), obj));
	}

	public List<Pessoa> findAll() {
		return pessoaRepository.findAll();
	}

	public Pessoa update(Long id, Pessoa pessoa) {
		Pessoa pessoaSalva = buscarPessoaPeloCodigo(id);

			  BeanUtils.copyProperties(pessoa, pessoaSalva, "id", "dataCadastro");
			  return this.pessoaRepository.save(pessoaSalva);
	}

	private Pessoa buscarPessoaPeloCodigo(Long id) {
		Pessoa pessoaSalva = this.pessoaRepository.findById(id)
				.orElseThrow(() -> new EmptyResultDataAccessException(1));
		return pessoaSalva;
	}

	public void deleteById(Long id) {
		pessoaRepository.deleteById(id);
	}
	
	

}
