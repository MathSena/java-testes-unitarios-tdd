package br.com.mathsena.tdd.modelo;

import java.time.LocalDate;
import java.math.BigDecimal;
import java.util.Objects;

public class Funcionario {

	private String nome;
	private LocalDate dataAdmissao;
	private BigDecimal salario;

	public Funcionario(String nome, LocalDate dataAdmissao, BigDecimal salario) {
		Objects.requireNonNull(nome, "Nome não pode ser nulo");
		Objects.requireNonNull(dataAdmissao, "Data de admissão não pode ser nula");
		Objects.requireNonNull(salario, "Salário não pode ser nulo");

		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		Objects.requireNonNull(nome, "Nome não pode ser nulo");
		this.nome = nome;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(LocalDate dataAdmissao) {
		Objects.requireNonNull(dataAdmissao, "Data de admissão não pode ser nula");
		this.dataAdmissao = dataAdmissao;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		Objects.requireNonNull(salario, "Salário não pode ser nulo");
		this.salario = salario;
	}

	public void reajustarSalario(BigDecimal reajuste) {
		this.salario = this.salario.add(reajuste);

	}
}
