package br.com.mathsena.tdd.modelo;

import java.math.BigDecimal;

public enum Desempenho {
    A_DESEJAR("A desejar", new BigDecimal("0.03")),
    BOM("Bom", new BigDecimal("0.15")),
    SUPERADO("Superado", new BigDecimal("0.25"));

    private final String descricao;
    private final BigDecimal percentualReajuste;

    Desempenho(String descricao, BigDecimal percentualReajuste) {
        this.descricao = descricao;
        this.percentualReajuste = percentualReajuste;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getPercentualReajuste() {
        return percentualReajuste;
    }
}
