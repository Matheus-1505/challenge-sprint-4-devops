package br.com.challenge.model.dto;

import br.com.challenge.model.entity.Usuario;

public record DadosListagemUsuario(
		String nome,
		String email

	) {
	
	public DadosListagemUsuario(Usuario usuario) {
		this(
				usuario.getNome(), 
				usuario.getEmail()
				
			);
	}
	
}
