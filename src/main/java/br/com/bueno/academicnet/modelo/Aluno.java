package br.com.bueno.academicnet.modelo;
import br.com.bueno.academicnet.repositorio.*;
import java.time.Instant;
import br.com.bueno.academicnet.controller.*;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor

@AllArgsConstructor
@Data
@Entity
public class Aluno {
	
	@Id
	private Long matricula;
	private String nome;
	private String telefone;
	private String email;
	private Instant dataCadastro;
	
}
