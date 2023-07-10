package service;

import java.math.BigDecimal;
import java.time.LocalDate;
import br.com.mathsena.tdd.modelo.Funcionario;
import br.com.mathsena.tdd.service.BonusService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {

    @DisplayName("This test must return 0 if the salary is higher than 10000")
    @Test
    void shouldBeZero() {
        BonusService service = new BonusService();
        Funcionario funcionario = createFuncionario("Rodrigo", "50000");

        BigDecimal bonus = service.calcularBonus(funcionario);

        assertEquals(BigDecimal.ZERO, bonus);
    }

    @DisplayName("This test must return 10% of salary if the salary is less than 10000")
    @Test
    void shouldBeTenPercent() {
        BonusService service = new BonusService();
        Funcionario funcionario = createFuncionario("Roger Guedes", "2500");

        BigDecimal bonus = service.calcularBonus(funcionario);

        assertEquals(new BigDecimal("250.00"), bonus);
    }

    @DisplayName("This test must return 10% of salary if the salary is equal 10000")
    @Test
    void shouldBeTenPercentForSalary10000() {
        BonusService service = new BonusService();
        Funcionario funcionario = createFuncionario("Roger Guedes", "10000");

        BigDecimal bonus = service.calcularBonus(funcionario);

        assertEquals(new BigDecimal("1000.00"), bonus);
    }

    private Funcionario createFuncionario(String nome, String salario) {
        return new Funcionario(nome, LocalDate.now(), new BigDecimal(salario));
    }
}
