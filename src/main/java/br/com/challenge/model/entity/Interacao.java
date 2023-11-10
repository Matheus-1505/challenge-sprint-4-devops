package br.com.challenge.model.entity;

import br.com.challenge.model.dto.DadosInteracao;
import jakarta.persistence.Embeddable;

@Embeddable
public class Interacao {

	
	private String data_interacao;
	private String descricao;
	private String tipo;
	private String prioridade;
	private String equipe_responsavel;
	private String telefone_equipe_responsavel;
	private String email_equipe_responsavel;

	public Interacao() {

	}

	public Interacao(DadosInteracao interacao) {
		this.data_interacao = interacao.data_interacao();
		this.descricao = interacao.descricao();
		this.tipo = interacao.tipo();
		this.prioridade = interacao.prioridade();
		this.equipe_responsavel = interacao.equipe_responsavel();
		this.telefone_equipe_responsavel = interacao.equipe_responsavel();
		this.email_equipe_responsavel = interacao.email_equipe_responsavel();

	}

	public void atualizarInformacoes(DadosInteracao dados) {
		if (dados.data_interacao() != null) {
			this.data_interacao = dados.data_interacao();
		}
		if (dados.descricao() != null) {
			this.descricao = dados.descricao();
		}
		if (dados.tipo() != null) {
			this.tipo = dados.tipo();
		}
		if (dados.prioridade() != null) {
			this.prioridade = dados.prioridade();
		}
		if (dados.equipe_responsavel() != null) {
			this.equipe_responsavel = dados.equipe_responsavel();
		}
		if (dados.telefone_equipe_responsavel() != null) {
			this.telefone_equipe_responsavel = dados.telefone_equipe_responsavel();
		}
		if (dados.email_equipe_responsavel() != null) {
			this.email_equipe_responsavel = dados.email_equipe_responsavel();
		}
	}

	public String getData_interacao() {
		return data_interacao;
	}

	public void setData_interacao(String data_interacao) {
		this.data_interacao = data_interacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

	public String getEquipe_responsavel() {
		return equipe_responsavel;
	}

	public void setEquipe_responsavel(String equipe_responsavel) {
		this.equipe_responsavel = equipe_responsavel;
	}

	public String getTelefone_equipe_responsavel() {
		return telefone_equipe_responsavel;
	}

	public void setTelefone_equipe_responsavel(String telefone_equipe_responsavel) {
		this.telefone_equipe_responsavel = telefone_equipe_responsavel;
	}

	public String getEmail_equipe_responsavel() {
		return email_equipe_responsavel;
	}

	public void setEmail_equipe_responsavel(String email_equipe_responsavel) {
		this.email_equipe_responsavel = email_equipe_responsavel;
	}

}