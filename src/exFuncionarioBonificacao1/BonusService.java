package exFuncionarioBonificacao1;

import java.math.BigDecimal;

public class BonusService {

	
	public BigDecimal calculaBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if(valor.compareTo(new BigDecimal("1000")) > 0) {
			valor = BigDecimal.ZERO;
		}
		return valor;
	}
	
	
}
