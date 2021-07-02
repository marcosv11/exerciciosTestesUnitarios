package exFuncionarioBonificacao1;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService service = new BonusService();
		//assertThrows(IllegalArgumentException.class,
				//() -> service.calculaBonus(new Funcionario("Marcos", LocalDate.now(), new BigDecimal("25000"))));
		
		try {
			service.calculaBonus(new Funcionario("Marcos", LocalDate.now(), new BigDecimal("25000")));
			fail("nao deu a exception");
		} catch (Exception e) {
			assertEquals("Funcionario com osalario maior que o permitido para o bonus", e.getMessage());
		}
		
	}

	@Test
	void bonusDeveriaSer10PorCentoDoSalario() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calculaBonus(new Funcionario("Marcos", LocalDate.now(), new BigDecimal("2500")));

		assertEquals(new BigDecimal("250.0"), bonus);
	}

	@Test
	void bonusDeveriaSerDezPorCentoParaSalarioDeExatamente10000() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calculaBonus(new Funcionario("Marcos", LocalDate.now(), new BigDecimal("10000")));

		assertEquals(new BigDecimal("1000.0"), bonus);
	}

}
