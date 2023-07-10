package br.com.mathsena.tdd.service;

import br.com.mathsena.tdd.modelo.Desempenho;
import br.com.mathsena.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {

    public void reajustar(Funcionario funcionario, Desempenho desempenho) {
        validarEntradas(funcionario, desempenho);

        BigDecimal percentualReajuste = desempenho.getPercentualReajuste();
        BigDecimal reajuste = calcularReajuste(funcionario.getSalario(), percentualReajuste);

        funcionario.reajustarSalario(reajuste);
    }

    private void validarEntradas(Funcionario funcionario, Desempenho desempenho) {
        if (funcionario == null) {
            throw new IllegalArgumentException("Funcionario não pode ser null");
        }
        if (desempenho == null) {
            throw new IllegalArgumentException("Desempenho não pode ser null");
        }
    }

    private BigDecimal calcularReajuste(BigDecimal salario, BigDecimal percentual) {
        return salario.multiply(percentual);
    }

}
