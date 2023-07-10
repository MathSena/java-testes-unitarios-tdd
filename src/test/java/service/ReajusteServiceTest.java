package service;

import br.com.mathsena.tdd.modelo.Desempenho;
import br.com.mathsena.tdd.modelo.Funcionario;
import br.com.mathsena.tdd.service.ReajusteService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {

    private static final Logger LOGGER = Logger.getLogger(ReajusteServiceTest.class.getName());

    @DisplayName("Reajust should be 3% if the feedback is not so good")
    @Test
    void ShouldBeThreePercent(){
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Maycon", LocalDate.now(), new BigDecimal("1000"));
        LOGGER.info("Test ShouldBeThreePercent is running");
        service.reajustar(funcionario, Desempenho.A_DESEJAR);

        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
        LOGGER.info("Test ShouldBeThreePercent has finished successfully");
    }

    @DisplayName("Reajust should be 15% if the feedback is good")
    @Test
    void ShouldBeTenPercent(){
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Fausto Vera", LocalDate.now(), new BigDecimal("1000"));
        LOGGER.info("Test ShouldBeTenPercent is running");
        service.reajustar(funcionario, Desempenho.BOM);

        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
        LOGGER.info("Test ShouldBeTenPercent has finished successfully");
    }

    @DisplayName("Reajust should be 25% if the feedback is excellent")
    @Test
    void ShouldBeTwentyPercent(){
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Murilo", LocalDate.now(), new BigDecimal("1000"));
        LOGGER.info("Test ShouldBeTwentyPercent is running");
        service.reajustar(funcionario, Desempenho.SUPERADO);

        assertEquals(new BigDecimal("1250.00"), funcionario.getSalario());
        LOGGER.info("Test ShouldBeTwentyPercent has finished successfully");
    }
}
