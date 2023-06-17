package com.mjv.classe;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.mjv.classe.enums.Sexo;

public class Cadastro {

	private String nome;
	private String cpf;
	private LocalDate nascimento;
	private Sexo sexo;
	private String logradouro;
	private String numero;
	private String bairro;
	private String complemento;
	private String cidade;
	private String estado;
	private String email;
	private Long telefone;
	private Long celular;
	private Long whatsapp;
	private String profissao;
	private String empresa;
	private Double salario;
	private boolean empregoAtual;
	private Double pretencaoMinima;
	private Double pretencaoMaxima;
	private List<String> habilidades = new ArrayList<>();

	public Cadastro() {
		super();
	}

	public Cadastro(String nome, String cpf, LocalDate nascimento, Sexo sexo, String logradouro, String numero,
			String bairro, String complemento, String cidade, String estado, String email, Long telefone, Long celular,
			Long whatsapp, String profissao, String empresa, Double salario, boolean empregoAtual,
			Double pretencaoMinima, Double pretencaoMaxima) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.sexo = sexo;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cidade = cidade;
		this.estado = estado;
		this.email = email;
		this.telefone = telefone;
		this.celular = celular;
		this.whatsapp = whatsapp;
		this.profissao = profissao;
		this.empresa = empresa;
		this.salario = salario;
		this.empregoAtual = empregoAtual;
		this.pretencaoMinima = pretencaoMinima;
		this.pretencaoMaxima = pretencaoMaxima;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	public Long getCelular() {
		return celular;
	}

	public void setCelular(Long celular) {
		this.celular = celular;
	}

	public Long getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(Long whatsapp) {
		this.whatsapp = whatsapp;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public boolean isEmpregoAtual() {
		return empregoAtual;
	}

	public void setEmpregoAtual(boolean empregoAtual) {
		this.empregoAtual = empregoAtual;
	}

	public Double getPretencaoMinima() {
		return pretencaoMinima;
	}

	public void setPretencaoMinima(Double pretencaoMinima) {
		this.pretencaoMinima = pretencaoMinima;
	}

	public Double getPretencaoMaxima() {
		return pretencaoMaxima;
	}

	public void setPretencaoMaxima(Double pretencaoMaxima) {
		this.pretencaoMaxima = pretencaoMaxima;
	}

	public List<String> getHabilidades() {
		return habilidades;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("[ \n").append("nome = " + nome).append(", cpf = " + cpf)
				.append(", nascimento = " + nascimento).append(", sexo = " + sexo)
				.append(", logradouro = " + logradouro).append(", numero = " + numero).append(", bairro = " + bairro)
				.append(", complemento = " + complemento).append(", cidade = " + cidade).append(", estado = " + estado)
				.append(", email = " + email).append(", telefone = " + telefone).append(", celular = " + celular)
				.append(", whatsapp = " + whatsapp).append(", profissao = " + profissao)
				.append(", empresa = " + empresa).append(", salario = " + salario)
				.append(", empregoAtual = " + empregoAtual).append(", pretencaoMinima = " + pretencaoMinima)
				.append(", pretencaoMaxima = " + pretencaoMaxima).append(", habilidades = " + habilidades)
				.append("\n ]");

		return String.valueOf(stringBuilder);
	}

}
