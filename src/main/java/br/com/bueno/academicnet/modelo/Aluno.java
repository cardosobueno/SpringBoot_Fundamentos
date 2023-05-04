package br.com.bueno.academicnet.modelo;

import java.time.Instant;

import lombok.Data;


@Data
public class Aluno {

	private String nome;
	private Long matricula;
	private String telefone;
	private String email;
	private Instant dataCadastro;
	
}
