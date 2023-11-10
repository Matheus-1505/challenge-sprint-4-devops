package br.com.challenge.model.dto;

import br.com.challenge.endereco.DadosEndereco;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosAtualizacaoUsuario(
		
		@NotNull
		Long id,
		String nome,
		@Email
		String email,
		@Pattern(regexp = "\\d{10,11}")
		String telefone,
		
		DadosEndereco endereco,
		
		DadosInteracao interacao,
		
		DadosChatGpt chatgpt
		
		
		) {

	
	
}
