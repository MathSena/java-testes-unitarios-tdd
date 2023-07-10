package br.com.mathsena.tdd.service;

import br.com.mathsena.tdd.modelo.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class BonusService {

	private static final BigDecimal MAX_BONUS = new BigDecimal("10000");
	private static final BigDecimal BONUS_PERCENTAGE = new BigDecimal("0.1");

	public BigDecimal calcularBonus(Funcionario funcionario) {
		Objects.requireNonNull(funcionario, "Funcionario não pode ser nulo");
		Objects.requireNonNull(funcionario.getSalario(), "Salário do funcionário não pode ser nulo");

		BigDecimal valor = funcionario.getSalario().multiply(BONUS_PERCENTAGE);
		if (valor.compareTo(MAX_BONUS) > 0) {
			throw new IllegalArgumentException("Funcionário com salário maior que 10000 não pode receber bônus");
		}
		return valor.setScale(2, RoundingMode.HALF_UP);
	}
}
