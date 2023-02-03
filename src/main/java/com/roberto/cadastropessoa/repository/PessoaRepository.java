package com.roberto.cadastropessoa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roberto.cadastropessoa.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
