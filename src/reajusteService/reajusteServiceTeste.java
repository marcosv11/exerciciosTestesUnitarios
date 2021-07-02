package reajusteService;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import exFuncionarioBonificacao1.Funcionario;

public class reajusteServiceTeste {

	@Test
	 public void reajusteDeveriaSerDeTresPorcentoQuandoDesemprenhoForADesejar() {
		 ReajusteService service = new ReajusteService();
		 Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"));
		 
		 service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
		  assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
		 
	}
	
	@Test
	 public void reajusteDeveriaSerDeQuinzePorcentoQuandoDesemprenhoForBom() {
		 ReajusteService service = new ReajusteService();
		 Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"));
		 
		 service.concederReajuste(funcionario, Desempenho.BOM);
		  assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
		 
	}
	
	@Test
	 public void reajusteDeveriaSerDeTrintaPorcentoQuandoDesemprenhoForOtimo() {
		 ReajusteService service = new ReajusteService();
		 Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"));
		 
		 service.concederReajuste(funcionario, Desempenho.OTIMO);
		  assertEquals(new BigDecimal("1300.00"), funcionario.getSalario());
		 
	}
	
}
