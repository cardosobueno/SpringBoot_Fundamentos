package br.com.bueno.academicnet.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bueno.academicnet.modelo.Aluno;

public interface AlunoRepositorio extends JpaRepository<Aluno, Long>{

}
